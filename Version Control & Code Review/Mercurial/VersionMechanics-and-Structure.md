
# *Versioning Mechanics*

## Branches

Branches are used to integrate different sets of work which will be integrated at the end. The common approach used now a days are using feature branch (ship able state) ,or maintenance branch(updates for older version) only for the main line and the other work is done with the other branches. The implicit branches are common in DAG environment, VC named branches are not common. Earlier, Mercurial cant set the explicitly named branches. They used to clone and create a separate publishing. But in the larger projects, it consumes lot of space and creating and publishing clones was too costly with respect to slow uptake time and disk space.
To deal with this problem, the Mercurial added branch name in the changeset metadata. `branch` command was introduced so that we can use name for next commits. The `update` command can be used to update the branch name with same changeset. This is called named branches. After few updates, mercurial included closing branches, so that if there are more than one head they needs to be resolved before deleting that branch. These is done by adding another layer of changeset.
There was more than one way to deal with branches. Git used References for naming their branches. These branches are ephemeral: this implies that one the pointer is removed, there is no way to getting that reference back and thereby untraceable forever like they never existed. It is similar to Mercurial cloning and merging to another clone. This prevents cluttering of data. Thus `bookmarks` q extension was formed. This keeps the unversioned track of files and makes it possible to push the bookmarks.

## Tags

when we use the `tag` command, we can see that .hgtag file is created in the repository. Every line in that file contains the changeset node id and the tag name. It is considered as any normal file in repository. The reason for this is because the changing name of tag should be possible, keep the track of changeset, to see the details like who created the tag and the reason and so on.  It should also tag the changeset activity, because some of the test drive projects release the artifacts before releasing. `.hgtags` make it easier to integrate with other parts or clone. Unlike git, who has tag outside the tree can rise the issue of creating duplicate parallel tag and cause issue later on.
Mercurial appends only new line to the `.hgtags`. We can also merge the files even if tag is in another clone. Creating an empty node means referring to root node and it deletes the tag. The recency calculations determines which tag takes precedence.    

# *General Structures*

Most of the Mercurial program is written in python language. Since python language simplifies the work for complex high level concepts, it is preferred normally. Some of the programs are in C since it simplifies the work at some extent. Python module can contain as many lines as needed and the module can also call upon other modules and import modules. The `_init_.py` package has all the information and modules needed to importer. 
Mercurial has two packages: `mercurial` and `hgtext`
`mercurial`: contains all the core packages required to run Mercurial
`hgtext` : contains  all the extensions and resources which might be useful for the program.

Since Mercurial is command line program, user has to type `hg` first then write the command for scripting. Some of the commands area `log`, `commit`, `diff`.
Some of the things that could happen after writing hg command like it could show status, can ask for further inputs on cmd line, or it can open external program.
In the command line arguments, arguments are passed and then the `ui` object is first instantiated. The ui class searches for the config in the directories and store them in ui object. Any global configs or path or an extension, all is stored in ui object. We can create a local repository, which will have local repository class and local repository module. We can use some of the commands for http or ssh or some of the internal commands. To initialize a new repository use the `init` command.
`commands` module contains all the core commands and it is easier to find the commands all in one module. Module also contains a hash-table to view the sets of all the options it takes. There are some common commands like log uses and the module can check the commands for the given options. Most of the commands work with ui object and repositories. 
