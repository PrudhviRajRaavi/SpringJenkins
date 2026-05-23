pipeline {
    agent any
    environment {
            APP_MESSAGE = credentials('APP_MESSAGE')
        }
    stages {
        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw -B clean package -Dapp.message="$APP_MESSAGE_PSW"'
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