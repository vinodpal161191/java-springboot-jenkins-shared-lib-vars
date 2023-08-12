def call(String registryUser, String appName, String tagName){
    sh """
        docker image build -t ${registryUser}/${appName} .
        docker image tag -t ${registryUser}/${appName}:${tagName}
        docker image tag -t ${registryUser}/${appName}:latest
    """
}