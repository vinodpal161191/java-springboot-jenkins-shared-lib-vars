def call(String registryUser, String appName, String tagName){
    sh """
        trivy image ${registryUser}/${appName}:latest >> scan.txt
        cat scan.txt
        
    """
}