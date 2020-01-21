def call(Closure closure) {
  node('windows') {
    closure()
  }
}
