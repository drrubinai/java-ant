pipeline {
    agent {
        docker {
            image 'frekele/ant' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh '/usr/bin/ant'
            }
        }
    }
}