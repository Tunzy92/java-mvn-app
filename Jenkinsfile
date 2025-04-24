pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "testing the application..."
                    sh 'mvn package'
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building docker image..."
                    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build . -t tunzy/demo-image:1'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push tunzy/demo-image:1'
                        }
                    }
                }
            }
        }
    }
