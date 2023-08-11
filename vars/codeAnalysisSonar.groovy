def call(){
    withSonarQubeEnv(credentialsId: 'sonar-api') {
        sh 'mvn clean package sonar:sonar'
    }
}