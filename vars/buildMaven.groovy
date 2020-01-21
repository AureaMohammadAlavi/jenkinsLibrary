def call(Map config) {
  node {
    git url: "https://github.com/AureaMohammadAlavi/$config.repository"
    sh "./gradlew classes"
    mail to: "m.alavi1986@yahoo.com", subject: "$config.repository", body: "$currentBuild.fullDisplayName ended in $currentBuild.currentResult"    
  }
}
