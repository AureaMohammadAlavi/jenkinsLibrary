def call(String name="smash") {
  echo "Hello $name"

  def file =new File("${env.WORKSPACE}/sample-junit.xml")
  file.delete()
  file << libraryResource ('me/smash/jenkins/sample.xml')

  junit "**/*.xml"
}
