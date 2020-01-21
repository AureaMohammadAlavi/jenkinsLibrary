package me.smash.jenkins

class MyLibrary implements Serializable {
  def steps
  MyLibrary(steps) {
    this.steps = steps
  }


  def printAllMethods( obj ) {
    if( !obj ){
      println( "Object is null\r\n" )
      return
    }
    if( !obj.metaClass && obj.getClass() ){
      printAllMethods( obj.getClass() )
      return
    }
    def str = "class ${obj.getClass().name} functions:\n"
    obj.metaClass.methods.name.unique().each{
      str += it+"(); "
    }
    steps.echo message: "${str}\n"
  }

  def printMessage(String msg) {

    steps.echo message: "MyLibrary"
    steps.echo message: msg
    steps.sh "${steps.tool 'java13'}/bin/java -version"
  }
}
