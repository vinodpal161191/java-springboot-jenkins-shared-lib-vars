// def call(String registryUser, String appName, String tagName){
//     sh """
//         trivy image ${registryUser}/${appName}:latest >> scan.txt
//         cat scan.txt
        
//     """
// }

def call(String awsAccountId, String ecrRepository, String awsRegion){
    sh """
        trivy image ${awsAccountId}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepository}:latest >> scan.txt
        cat scan.txt
        
    """
}