pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo "Running build stage"
        sh "mvn clean install"
      }
    }
    stage('Execute jar') {
      steps {
        echo "Running jar exucute stage"
        sh "java -jar target/jenkins-project-1.0-SNAPSHOT.jar"
      }
    }
  }
}
