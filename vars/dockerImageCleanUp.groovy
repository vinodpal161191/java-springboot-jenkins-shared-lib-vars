def call(String registryUser, String appName, String tagName){

    sh "docker rmi ${registryUser}/${appName}:${tagName}"
    sh "docker rmi ${registryUser}/${appName}:latest"
}