def buildJar() {
    echo "Building the application..."
    sh 'mvn package'
}
def buildImage() {
    echo "Building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t tunzy/demo-image:1.1 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push tunzy/demo-image:1.1'
    }
}
def deployJar() {
    echo "deploying the application..."
}

return this