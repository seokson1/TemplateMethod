package org.example.keyboard;

import org.example.key.KeyboardKey;

public class EscKeyMonitoringKeyboard extends Keyboard {
    @Override
    protected void keyUp(KeyboardKey keyboardKey) {
        if(isEscKey(keyboardKey)){
            System.out.println("ESC Logging...key up" + keyboardKey.getKey());
        }
    }

    @Override
    protected void keyDown(KeyboardKey keyboardKey) {
        if(isEscKey(keyboardKey)){
            System.out.println("ESC Logging...key up" + keyboardKey.getKey());
        }
    }

    private boolean isEscKey(KeyboardKey keyboardKey) {
        return  "ESC".equalsIgnoreCase(keyboardKey.getKey()); // 실제 작업을 할떄 반대 형태로 작업해야됨.
        //이유는 만약에 null이 나오면 오류 발생할 수 있음.
        //return keyboardKey.getKey().equalsIgnoreCase("ESC");
    }
}
