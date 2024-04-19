package godot;

import godot.annotation.Export;
import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.annotation.RegisterProperty;

@RegisterClass
public class PrintTextJava extends Label {
    @Export
    @RegisterProperty
    public int test = 0;

    @RegisterFunction
    @Override
    public void _ready() {
        setText("Hi! I'm a script written in Java!");
    }
}
