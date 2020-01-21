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
    steps.echo message: msg
    // def java13 = steps.evaluate("tool.java13")
    steps.echo message: "properties: ${steps.getProperties()}, java13: ${steps.tool 'java13'}"

    printAllMethods(steps)

  }
}
