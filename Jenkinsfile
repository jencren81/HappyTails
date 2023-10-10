pipeline {
    agent any

   

    stages {
        stage('Build') {
            steps {
             
                git 'https://github.com/jencren81/HappyTails.git'

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
            post {
               
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }

