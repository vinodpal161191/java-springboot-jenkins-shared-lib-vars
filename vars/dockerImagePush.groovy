def call(String registryUser, String appName, String tagName){
    withCredentials([usernameColonPassword(credentialsId: 'dockerhub-credential', variable: 'DOCKERHUB_CREDENTIAL')]) {
        // some block
        sh "docker login -u $registryUser -p 'DOCKERHUB_CREDENTIAL'"
    }

    withCredentials([usernamePassword(credentialsId: 'docker-credential', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
        // some block
        sh "docker login -u $DOCKER_USER -p $DOCKER_PASS"
    }

    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:${tagName}"
    sh "docker image push ${registryUser}/${appName} ${registryUser}/${appName}:latest"
}