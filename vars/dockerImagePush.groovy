def call(String registryUser, String appName, String tagName){
    withCredentials([usernameColonPassword(credentialsId: 'dockerhub-credential', variable: 'DOCKERHUB_CREDENTIAL')]) {
        // some block
        sh "docker login -u $registryUser -p 'DOCKERHUB_CREDENTIAL'"
    }

    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:${tagName}"
    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:latest"
}