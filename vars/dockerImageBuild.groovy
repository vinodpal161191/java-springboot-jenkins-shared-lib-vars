def call(String registryUser, String appName, String tagName){
    sh """
        docker image build -t ${registryUser}/${appName}:${tagName} .
    """
}