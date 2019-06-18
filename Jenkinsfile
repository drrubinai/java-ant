pipeline {
    agent {
        docker {
            image 'frekele/ant' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                ant 
            }
        }
    }
}