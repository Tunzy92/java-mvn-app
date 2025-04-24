pipeline {
    agent any
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "building the jar"
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building docker image"
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying the application"
                }
            }
        }
    }  
