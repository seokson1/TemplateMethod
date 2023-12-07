package org.example;

import org.example.keyboard.EscKeyMonitoringKeyboard;
import org.example.keyboard.Keyboard;

public class Main {
    public static void main(String[] args) {
        //Keyboard keyboard = new LoggingKeyboard();
        Keyboard keyboard = new EscKeyMonitoringKeyboard();
        keyboard.press(new AlphabetKey("A"));
        keyboard.press(new AlphabetKey("B"));
        keyboard.press(new AlphabetKey("C"));
        keyboard.press(new AlphabetKey("ESC"));
        //예외상황이 있으면 절대로 사용하면 안됨. 템플릿 형태 변할 때 있으면 사용하면 안됨
        // 전략패턴 사용하면 좋음. 예외 상황 있을 경우
    }
}