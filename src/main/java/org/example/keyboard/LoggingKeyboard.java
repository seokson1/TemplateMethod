package org.example.keyboard;

import org.example.key.KeyboardKey;

public class LoggingKeyboard extends Keyboard {
    @Override
    protected void keyUp(KeyboardKey keyboardKey) {
        System.out.println("Logging...key up" + keyboardKey.getKey());
    }

    @Override
    protected void keyDown(KeyboardKey keyboardKey) {
        System.out.println("Logging..key down" + keyboardKey.getKey());
    }
}
