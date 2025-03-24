#!/usr/bin/env groovy

@Library('jenkins-shared-library')
def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    buildImage()
                }
            }
        }
        stage("test") {
            steps {
                script {
                    echo "Testing the application"
=======
pipeline {
    agent none
   stages {
        stage('test') {
            steps {
                script {
                   echo "Testing the application.."
                    echo "Executing pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage("build") {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    echo "Building the application..."
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
                }
            }
        }
        stage("deploy") {
<<<<<<< HEAD
            steps {
                script {
                    echo "Deploying the application"
=======
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    echo "Deploying the application.."
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
                }
            }
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
