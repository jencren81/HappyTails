pipeline {
    agent any

   

    stages {
         stage('Checkout'){
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'gh pk', url: 'git@github.com:jencren81/HappyTails.git']])
            }
        }
        stage('Build') {
            steps {
             
              

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
        
        stage ('Build Docker Image'){
            steps{
                
                sh "docker build -t jencren81/happyt_pro4_pipeline:${BUILD_NUMBER} ."
                
            }
        }
        
        stage ('Docker Login'){
            steps{
                withCredentials([string(credentialsId: 'DockerId', variable: 'Dockerpwd')]) {
                sh "docker login -u jencren81 -p ${Dockerpwd}"
            }
        }
        
        stage ('Docker Push'){
            steps{
                
                sh "docker push jencren81/happyt_pro4_pipeline:${BUILD_NUMBER}"

            }
        }
            
        }
    }

