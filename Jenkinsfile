pipeline {
    agent {
        docker {
            image 'frekele/ant' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                /bin/sh '/usr/bin/ant'
            }
        }
    }
}