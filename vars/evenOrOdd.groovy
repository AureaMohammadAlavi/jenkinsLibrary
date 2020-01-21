def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipleline {
      agent any
      stages('even') {
        steps {
          echo "even build number $env.BUILD_NUMBER"
        }
      }
    }
  } else {
    pipleline {
      agent any
      stages('odd') {
        steps {
          echo "odd build number $env.BUILD_NUMBER"
        }
      }
    }
  }
}
