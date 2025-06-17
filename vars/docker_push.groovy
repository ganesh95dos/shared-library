def call(String dockerHubUser, String imageName, String tag, String credentialsId) {
    withCredentials([usernamePassword(credentialsId: 'Jenkins-app-note-django', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh """
            echo \$dockerHubPass | docker login -u \$dockerHubUser --password-stdin
            docker tag ${imageName}:${tag} \$dockerHubUser/${imageName}:${tag}
            docker push \$dockerHubUser/${imageName}:${tag}
        """
    }
}
