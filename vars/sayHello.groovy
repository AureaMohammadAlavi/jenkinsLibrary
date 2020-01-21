def call(String name="smash") {
  echo "Hello $name"

  def file =new File("${env.WORKSPACE}/sample-junit.xml")
  file.delete()
  def xml = libraryResource 'me/smash/jenkins/sample.xml'
  echo "xml: $xml"

  // junit "**/*.xml"
}
