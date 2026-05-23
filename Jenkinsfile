pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw -B clean package'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}