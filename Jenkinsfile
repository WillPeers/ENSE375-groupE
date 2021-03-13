pipeline {
  agent any
  stages {
    stage('Build') {
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