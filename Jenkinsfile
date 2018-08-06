pipeline {
  agent any
  stages {
    stage('War') {
      steps {
        git(url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git', branch: 'master')
        git(url: 'https://github.com/KuruvaSomaSekhar/HelloworldDocker.git', branch: 'webApps')
      }
    }
    stage('error') {
      steps {
        sh '''pwd 

ls -l
/opt/maven/mvn war:war'''
      }
    }
  }
}