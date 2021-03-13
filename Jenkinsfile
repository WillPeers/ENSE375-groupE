pipeline {
  agent any
  stages {
    stage('Build') {
      steps{
        git url: "https://github.com/WillPeers/ENSE375-groupE.git"
        sh 'mvn compile -f RiskMeter/pom.xml'
      } 
    }

    stage('Test') {
      steps {
        sh 'mvn test -f RiskMeter/pom.xml'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }

  }
}