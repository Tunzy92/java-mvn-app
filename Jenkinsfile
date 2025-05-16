#!/bin/bash/env groovy

@Library("jenkins-shared-library")
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
        stage("Build") {
            steps {
                script {
                    buildJar()
                }
            }
        }
         stage("Test") {
            steps {
                script {
                    testJar()
                }
            }
        }
         stage("Deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}