def call(String project, String imageTag, String dockerHubUser) {
  withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
    sh """
      echo \$DOCKER_PASSWORD | docker login -u \$DOCKER_USERNAME --password-stdin
      docker tag ${project}:${imageTag} \$DOCKER_USERNAME/${project}:${imageTag}
      docker push \$DOCKER_USERNAME/${project}:${imageTag}
    """
  }
}
