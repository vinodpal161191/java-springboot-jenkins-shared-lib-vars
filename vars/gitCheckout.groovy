def call(Map stageParams){

    checkout scmGit(
        branches: [[name: '*/main']], 
        extensions: [], 
        userRemoteConfigs: [[url: 'https://github.com/vinodpal161191/java-springboot-jenkins-shared-lib.git']]
    )
}