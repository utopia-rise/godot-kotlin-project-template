package godot

import godot.annotation.{Export, RegisterClass, RegisterFunction, RegisterProperty}
import godot.api.Label

@RegisterClass
class PrintTextScala extends Label {

  @Export
  @RegisterProperty
  var test: Int = 0

  @RegisterFunction
  override def _ready(): Unit = {
    setText("Hi! I'm a script written in Scala!")
  }
}
