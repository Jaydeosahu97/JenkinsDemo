pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'gradle clean'
                bat 'gradle bootJar'
            }
        }
        stage('Test'){
            steps {
                bat 'gradle testClasses'
            }
        }
        stage('deploy'){
            steps{
                echo 'deploy'
            }
        }
    }
}