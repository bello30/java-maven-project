#!/usr/bin/env groovy

@Library('jenkins-shared-library')
def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    environment {
            PATH = "${env.PATH}:/usr/local/docker"
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
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "Deploying application"
                }
            }
        }
    }
}