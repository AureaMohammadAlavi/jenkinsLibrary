def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('even') {
          steps {
            echo "even build number $env.BUILD_NUMBER"
          }
        }
      }
    }
    } else {
      pipeline {
        agent any
        stages {
          stage('odd') {
            steps {
              echo "odd build number $env.BUILD_NUMBER"
            }
          }
        }
      }
    }
  }
