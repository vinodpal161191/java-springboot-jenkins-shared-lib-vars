def call(String registryUser, String appName, String tagName){
    sh """
        docker image build -t ${registryUser}/${appName} .
        docker image tag ${registryUser}/${appName} ${registryUser}/${appName}:${tagName}
        docker image tag ${registryUser}/${appName} ${registryUser}/${appName}:latest
    """
}