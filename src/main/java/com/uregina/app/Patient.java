package com.uregina.app;
import com.uregina.exception.*;
import java.util.regex.*;


public class Patient 
{
	private String name;
	private String ID;
	private int age;
	private PostalCode postalCode;
	
	public Patient(String name, String ID, int age, PostalCode postalCode) throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
	{
		this.name = name;
		this.ID = ID;
		this.age = age;
		this.postalCode = postalCode;
	}
	public String getName()
	{
		return this.name;
	}
	public String getID()
	{
		return this.ID;
	}
	public int getAge()
	{
		return this.age;
	}
	public PostalCode getPostalCode()
	{	
		return this.postalCode;
	}
	/**
	*
	* @return boolean: true if the age is corrected set 
	*/
	public boolean setAge(int age)
	{
		this.age = age;
		return true;
	}
	/**
	*
	* @return boolean: true if the postal code is corrected set 
	*/
	public boolean setPostalCode(PostalCode postalCode)
	{
		this.postalCode = postalCode;
		return true;
	}

	public boolean ValidateName(String name)
	{
		if(name.matches("^[a-zA-Z]*$"))
		{
			return true;
		}

		else if (name.matches("[a-zA-Z][a-zA-Z ]+"))
		{
			return true;
		
		}
		else if (name.matches("(?i)[a-z]+([.\\s]+[a-z]+)*"))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
}

/*Reference
https://www.geeksforgeeks.org/check-if-a-string-contains-only-alphabets-in-java-using-regex
https://stackoverflow.com/questions/9289451/regular-expression-for-alphabets-with-spaces*/
