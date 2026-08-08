package godot

import godot.annotation.{Export, Script}
import godot.api.Label

@Script
class PrintTextScala extends Label {

  @Export
  var test: Int = 0

  override def _ready(): Unit = {
    setText("Hi! I'm a script written in Scala!")
  }
}
