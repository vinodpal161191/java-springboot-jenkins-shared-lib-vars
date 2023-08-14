// def call(String registryUser, String appName, String tagName){

//     sh "docker rmi ${registryUser}/${appName}:${tagName}"
//     sh "docker rmi ${registryUser}/${appName}:latest"
// }

def call(String awsAccountId, String ecrRepository, String awsRegion){

    sh "docker rmi ${awsAccountId}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepository}:latest"
}