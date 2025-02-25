def call(String dockerHubUser, String ProjectName, String ImageTag ){
withCredentials([usernamePassword(
                    credentialsId: "Jenkins-app-note-django", 
                    passwordVariable: "dockerHubPass", 
                    usernameVariable: "dockerHubUser"
                )]){
 sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
 sh 'docker image prune -f'}
 
}
