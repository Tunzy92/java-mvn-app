def BuildJar() {
    sh 'echo Building the application...'
    sh 'mvn package'
}

def BuildImage() {
    echo "Building the application..."
    withCredentials([usernamePassword(credentialsId: "dockerhub", passwordVariable: PASS, usernameVariable: USER)]) {
        sh 'docker build -t tunzy/demo-image:1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push tunzy/demo-image:1.0'
    }
}
def DeployJar() {
    echo "Testing the application..."
}

return this
// This is a Groovy script that defines a Jenkins pipeline for building, testing, and deploying a Java application.