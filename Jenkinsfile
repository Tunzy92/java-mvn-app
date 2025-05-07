def gv

pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage("Init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        
        stage("Build Jar") {
            steps {
                script {
                    gv.buildJar()
                }
            }
        }
        stage("Build image") {
            steps {
                script {
                     gv.buildImage()
                }
            }
        }
        stage("Deploy Jar") {
            steps {
                script {
                    gv.deployJar()
                }
            }
        }
    }
}