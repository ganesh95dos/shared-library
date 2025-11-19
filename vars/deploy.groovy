def call() {
  sh "docker-compose down"
  sh "docker-compose up -d"
  sh 'docker image prune -f'
}
