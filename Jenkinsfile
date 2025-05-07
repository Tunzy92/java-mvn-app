def pipe
pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage("Init") {
            steps {
                script {
                    pipe = load "script.groovy"      
                }
            }
        }
        stage("Build Jar") {
            steps {
                script {
                   pipe.BuildJar()
                }
            }
        }
        stage("Test") {
            steps {
                script {
                    pipe.TestJar()
                }
            }
        }
        stage("BuildImage") {
            steps {
                script {
                     pipe.BuildImage()
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    pipe.DeployJar()
                }
            }
        }
    }
}