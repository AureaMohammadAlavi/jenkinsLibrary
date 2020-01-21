def call(String name="smash") {
  echo "Hello $name"

  new File("sample-junit.xml") <<"""
  <?xml version="1.0" encoding="UTF-8"?>
<testsuite name="me.smash.SomeClassTest" tests="1" skipped="0" failures="0" errors="0" timestamp="2020-01-21T12:11:17" hostname="MacBook-Pro.local" time="0.001">
  <properties/>
  <testcase name="test1" classname="me.smash.SomeClassTest" time="0.001"/>
  <system-out><![CDATA[]]></system-out>
  <system-err><![CDATA[]]></system-err>
</testsuite>
  """

  junit "**/*.xml"
}
