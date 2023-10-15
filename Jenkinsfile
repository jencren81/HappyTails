pipeline {
    agent any

   
    environment {
        AWS_ACCESS_KEY_ID = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }
    
    stages {
       steps {
                git 'https://github.com/jencren81/HappyTails.git'

                script {
                    // Specify the path to the Maven wrapper script
                    def mavenWrapper = "${env.WORKSPACE}/mvnw"  // Update the path as needed
                    sh "${mavenWrapper} clean compile"
                }

                echo 'Building project with maven compile'
            }
        }
        stage ('Test') {
            steps {
                
                sh "./mvnw test"
                
                echo "Testing the project with maven test"
            }
        }
        stage ('Deloy'){
            steps{
                
                sh "./mvnw package"
                
                echo "Deloying project with maven package"
            }
        }
           
        }
    

