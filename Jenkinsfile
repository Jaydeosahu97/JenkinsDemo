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
                bat 'gradle test'
            }
        }
        stage('deploy'){
            steps{
                bat 'gradle bootRun'
            }
        }
    }
}
