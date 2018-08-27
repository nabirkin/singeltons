package com.nabirkin.study.singletons;


public class Singleton5 {

    private static Singleton5 instance;

    int value;

    private Singleton5() {
        this.value = 10;
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }

        }
        return instance;
    }
}
