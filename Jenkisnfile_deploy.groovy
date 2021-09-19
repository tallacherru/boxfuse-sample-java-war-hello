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
             ssh -i /tmp/demo.pem ec2-user@172.31.23.252 "echo "Im in tomcat" && sudo chmod +x /tmp/deployment.sh && sudo bash /tmp/deployment.sh ${jobname} ${branch_name} ${build_number}"

             """
            }
        }
    }

}