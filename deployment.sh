#1/bin/bash
aws s3 ls 
ls -la
hostname -i
systemctl status tomcat
aws s3 cp s3://artificats061/buildpipeline-git/master/15/hello-15.war /tmp/
cp /tmp/hello-15.war /var/lib/tomcat/webapps
