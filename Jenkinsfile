pipeline {
  agent any
  stages {
    stage('Build') {
      steps{
        git url: 'https://github.com/WillPeers/ENSE375-groupE'
        withMaven {
          sh "cd RiskMeter"
          sh "mvn clean verify"
        }
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