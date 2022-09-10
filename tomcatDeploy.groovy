def call(ip,user,credid){
  sshagent( [credid] ) {
  sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat9/webapps/app.war"
  sh "ssh ${user}@${ip} /opt/tomcat9/bin/shutdown.sh"
  sh "ssh ${user}@${ip} /opt/tomcat9/bin/startup.sh"
  }
}
