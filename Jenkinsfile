pipeline {
    agent any

   

    stages {
        stage('Build') {
            steps {
             
                git 'https://jencren81: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@github.com/jencren81/HappyTails.git'

                sh "mvn compile"
                
                echo 'Building project with maven compile'

               
            }
        }
        stage ('Test') {
            steps {
                
                sh "mvn test"
                
                echo "Testing the project with maven test"
            }
        }
        stage ('Deloy'){
            steps{
                
                sh "mvn package"
                
                echo "Deloying project with maven package"
            }
        }
            
        }
    }

