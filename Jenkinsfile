pipeline {
  agent any
  stages {
    stage('Fetch') {
      steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/main']],userRemoteConfigs:
                [[credentialsId: 'git-ssh-key', url: 'git@github.com:WillPeers/ENSE375-groupE.git']]]
            }
    }
    stage('Build') {
      steps{
        echo 'Building..'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }

  }
}