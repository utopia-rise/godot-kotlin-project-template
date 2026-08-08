package godot;

import godot.annotation.Export;
import godot.annotation.Script;
import godot.api.Label;

@Script
public class PrintTextJava extends Label {
    @Export
    public int test = 0;

    public void _ready() {
        setText("Hi! I'm a script written in Java!");
    }
}
