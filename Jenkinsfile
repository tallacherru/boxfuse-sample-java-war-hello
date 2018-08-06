pipeline {
  agent any
  stages {
    stage('War') {
      steps {
        git(url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git', branch: 'master')
        git(url: 'https://github.com/KuruvaSomaSekhar/HelloworldDocker.git', branch: 'webApps')
      }
    }
    stage('') {
      steps {
        sh '''pwd 
cd War
ls -l
/opt/maven/mvn war:war'''
      }
    }
  }
}