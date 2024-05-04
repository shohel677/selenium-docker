pipeline {
    agent any

    triggers {
        cron('0 0 * * *')
    }

    environment {
        // Define Maven and Java installations
        mvnHome = tool 'Maven'
        javaHome = tool 'Java'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout Maven Selenium Java project from Git
                bat "git clone -b main https://github.com/shohel677/selenium-docker.git"
            }
        }

        stage('Build') {
            steps {
                // Build Maven project
                bat "${mvnHome}\\bin\\mvn clean install"
            }
        }

        stage('Test') {
            steps {
                // Run Selenium tests
                bat "${mvnHome}\\bin\\mvn clean test -Dbrowser=chrome -DsuiteFile=suites\\user_registration.xml -Dplatform=windows -DhubUrl=http://localhost:4444/wd/hub"
            }
        }

        stage('Email Report') {
            steps {
                script {
                    // Copy test report to workspace
                    bat 'xcopy /s report %WORKSPACE%'
                    // Send email with attached test report
                    emailext body: 'Please find attached test report.',
                             subject: 'Selenium Test Report',
                             attachmentsPattern: "%WORKSPACE%/report/*.*",
                             to: 'golzarahamedshohel@gmail.com'
                }
            }
        }
    }

    // Post-build configuration
    post {
        always {
            // Clean workspace
            cleanWs()
        }
    }
}
