#!/bin/bash/env groovy

def call() {
    echo "Building the application.."
    sh 'mvn package'
}