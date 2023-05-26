package com.dizhang.sample_object.single;

public class demo1 {
    private demo1() {

    }

    private static demo1 instance;

    public static demo1 getInstance() {
        if (instance == null)
            instance = new demo1();
        return instance;
    }
}
