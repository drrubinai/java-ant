pipeline {
    agent {
        docker {
            image 'frekele/ant' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'ant build.xml' 
            }
        }
    }
}