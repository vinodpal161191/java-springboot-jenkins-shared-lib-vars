// def call(String registryUser, String appName, String tagName){
//     sh """
//         docker image build -t ${registryUser}/${appName} .
//         docker image tag ${registryUser}/${appName} ${registryUser}/${appName}:${tagName}
//         docker image tag ${registryUser}/${appName} ${registryUser}/${appName}:latest
//     """
// }


def call(String awsAccountId, String ecrRepository, String awsRegion){
    sh """
        docker build -t ${ecrRepository} .
        docker tag ${ecrRepository}:latest ${awsAccountId}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepository}:latest
    """
}