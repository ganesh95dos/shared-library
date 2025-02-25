def call(String DockerHubUser, String ProjectName, String ImageTag ){
 echo 'Hello, this is building the code'
 //Run the Docker build command
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
 
 // List images after building
    sh 'docker images'
 // Remove untagged (dangling) images
    sh 'docker image prune -f'
}
