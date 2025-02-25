def call(String DockerHubUser, String ProjectName, String ImageTag ){
 echo 'Hello, this is building the code'
 //Run the Docker build command
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
 
 // List images after building
    sh 'docker images'
 // Remove untagged (dangling) images
    sh 'docker image prune -f'
}

                // Build the Docker image
               // sh 'docker build -t my-django-note-app:latest .'

                
                
                // Remove untagged (dangling) images
               // sh 'docker image prune -f'

               // echo 'Build code successfully'  // Echo for success message
