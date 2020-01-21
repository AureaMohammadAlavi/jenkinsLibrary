package me.smash.jenkins

class MyLibrary {
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
    println "${str}\n"
  }
  
  def printMessage(String msg) {
    steps.echo message: msg
    printAllMethods(steps)

  }
}
