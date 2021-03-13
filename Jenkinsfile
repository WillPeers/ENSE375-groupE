pipeline {
  agent any
  stages {
    stage('Build') {
      git url: 'https://github.com/WillPeers/ENSE375-groupE.git'
    withMaven {
      sh "mvn clean verify"
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