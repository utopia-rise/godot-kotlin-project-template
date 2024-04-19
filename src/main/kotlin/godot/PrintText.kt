package godot

import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class PrintText : Label() {

    @Export
    @RegisterProperty
    var test: Int = 0

    @RegisterFunction
    override fun _ready() {
        text = "Hi! I'm a script written in Kotlin!"
    }
}
