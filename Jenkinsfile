def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("Init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    gv.buildApp()
                    }
                }
            }
        }
    }
