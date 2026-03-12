pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo/ai-predictor.git'
            }
        }
        
        stage('Build & Test') {
            steps {
                // Runs Maven build, JUnit tests, and JaCoCo coverage
                sh 'mvn clean verify'
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                // Sends code to SonarQube server for bug/vulnerability scanning
                withSonarQubeEnv('My SonarQube Server') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                // Deploys the generated .war file to your server
                deploy adapters: [tomcat8(url: 'http://localhost:8080', credentialsId: 'tomcat-auth')], 
                       contextPath: 'disease-app', 
                       war: '**/*.war'
            }
        }
    }
}