pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage("Build Jar") {
            steps {
                script {
                   sh 'echo Building the application...'
                   sh 'mvn package'
                }
            }
        }
        stage("BuildImage") {
            steps {
                script {
                     echo "Building the application..."
                     withCredentials([usernamePassword(credentialsId: "dockerhub", passwordVariable: PASS, usernameVariable: USER)]) {
                        sh 'docker build -t tunzy/demo-image:1.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push tunzy/demo-image:1.0'
                    }
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    echo "deploying the application..."
                }
            }
        }
    }
}