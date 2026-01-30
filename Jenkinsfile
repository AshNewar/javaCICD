pipeline {
    agent any

    tools {
        maven 'MAVEN'
        jdk 'OPEN_JDK_21'
    }

    stages {
        // stage('Clone') {
        //     steps {
        //         git branch: 'main', url: 'https://github.com/AshNewar/javaCICD.git'
        //     }
        // }

        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        failure {
            echo 'Mailing System Started'
            emailext body: """
Build Failed ❌

Job: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}
Stage: ${env.STAGE_NAME}
Build URL: ${env.BUILD_URL}
""",
                subject: ' Jenkins Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}',
                to: 'jnvspr12345@gmail.com'

            echo 'Mail Sent'
        }

        success {
            echo '✅ Pipeline completed successfully'
        }
    }
}
