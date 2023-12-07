package org.example;

import org.example.key.KeyboardKey;

public class AlphabetKey implements KeyboardKey {
    private String keyName;
    public AlphabetKey(String keyName) {
        this.keyName = keyName;
    }

    @Override
    public String getKey() {
        return keyName;
    }
}
