def call(String ProjectName, String ImageTag, String DockerHubUser){
 //Run the Docker build command
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
