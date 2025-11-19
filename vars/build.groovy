def call(String dockerHubUser, String ProjectName, String ImageTag ){

 sh "docker build -t ${ProjectName}:${ImageTag} ."
 sh 'docker image prune -f'
 
}
