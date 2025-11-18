def call(String ProjectName, String ImageTag){
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
