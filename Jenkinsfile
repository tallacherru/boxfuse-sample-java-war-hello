pipeline {
  agent any
  stages {
    stage('War') {
      steps {
        git(url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git', branch: 'master')
      }
    }
    stage('error') {
      steps {
        sh '''pwd 

ls -l
/opt/maven/bin/mvn clean package 

cp target/hello*.war /opt/extract/hello.war'''
      }
    }
  }
}