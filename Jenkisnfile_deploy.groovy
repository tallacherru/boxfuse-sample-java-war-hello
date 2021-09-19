//Deployment pipeline
//declarative pipeline
pipeline {

    agent any
    stages {
        stage("Download artifacts") {
        steps {
            sh """ hostname 
             ls -l
             pwd
             scp -i /tmp/demo.pem deployment.sh ec2-user@172.31.23.252:/tmp/

             """
            }
        }
    }

}