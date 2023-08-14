// def call(String registryUser, String appName, String tagName){

//     withCredentials([usernamePassword(credentialsId: 'docker-credential', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
//         // some block
//         sh "docker login -u $DOCKER_USER -p $DOCKER_PASS"
//     }

//     sh "docker image push ${registryUser}/${appName}:${tagName}"
//     sh "docker image push ${registryUser}/${appName}:latest"
// }

def call(String awsAccountId, String ecrRepository, String awsRegion){

    sh "aws ecr get-login-password --region ${awsRegion} | docker login --username AWS --password-stdin ${awsAccountId}.dkr.ecr.${awsRegion}.amazonaws.com"
    sh "docker push ${awsAccountId}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepository}:latest"
}