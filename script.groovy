def buildJar() {
    echo "testing the application..."
    sh 'mvn package'
}

def buildImage() {
    echo "building docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build . -t tunzy/demo-image:1.1'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push tunzy/demo-image:1.1'
    }
}
return this
