package com.GPTSchool.singleton;

public class Government {
    private static Government instance;

    private Government() {}

    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }
}

