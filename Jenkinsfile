pipeline {
    agent any

   

    stages {
        stage('Build') {
            steps {
             
                git 'https://jencren81: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@github.com/jencren81/HappyTails.git'

                sh "./mvnw compile"
                
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
    }

