//Deployment pipeline
//declarative pipeline
pipeline {

    agent any
    stages {
        stage("Download artifacts")
        steps {
            sh """ hostname  """
        }

    }

}