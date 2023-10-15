pipeline {
    agent any

   
    environment {
        AWS_ACCESS_KEY_ID = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }
    
    stages {
        stage('Build') {
            steps {
             
                git 'https://github.com/jencren81/HappyTails.git'

                sh "sudo ./mvnw compile"
                
                echo 'Building project with maven compile'

               
            }
        }
        stage ('Test') {
            steps {
                
                sh "sudo ./mvnw test"
                
                echo "Testing the project with maven test"
            }
        }
        stage ('Deloy'){
            steps{
                
                sh "sudo ./mvnw package"
                
                echo "Deloying project with maven package"
            }
        }
           
        }
    }

