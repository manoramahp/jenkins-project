pipeline {
  agent any
  stages {
    stage('Build') {
      echo "Running build stage"
      mvn clean install
    }
    stage('Execute jar') {
      echo "Running jar exucute stage"
      sh "java -jar target/jenkins-project-1.0-SNAPSHOT.jar"
    }
  }
}
