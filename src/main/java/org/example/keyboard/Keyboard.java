package org.example.keyboard;

import org.example.key.KeyboardKey;

public abstract class Keyboard {
    public void press(KeyboardKey keyboardKey){
        
        keyDown(keyboardKey);
        System.out.println("입력된 키 : " + keyboardKey.getKey());
        keyUp(keyboardKey);
    }

    protected abstract void keyUp(KeyboardKey keyboardKey);

    protected abstract void keyDown(KeyboardKey keyboardKey);

}
