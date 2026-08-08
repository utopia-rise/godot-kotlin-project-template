package godot

import godot.annotation.Export
import godot.annotation.Script
import godot.api.Label

@Script
class PrintText : Label() {

    @Export
    var test: Int = 0

    override fun _ready() {
        text = "Hi! I'm a script written in Kotlin!"
    }
}
