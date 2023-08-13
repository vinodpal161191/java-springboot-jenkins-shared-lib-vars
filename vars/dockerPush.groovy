def call(String registryUser, String appName, String tagName){
    withCredentials([usernameColonPassword(credentialsId: 'dockerhub-credential', variable: 'DOCKERHUB_CREDENTIAL')]) {
        // some block
        sh "docker login -u $registryUser -p $DOCKER_HUB_CREDENTIALS"
    }

    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:${tagName}"
    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:latest"
}