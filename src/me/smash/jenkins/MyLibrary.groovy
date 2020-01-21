package me.smash.jenkins

class MyLibrary {
  def steps
  MyLibrary(steps) {
    this.steps = steps
  }

  def printMessage(String msg) {
    steps.echo message: msg
    steps.echo message: steps.tool.java13
  }
}
