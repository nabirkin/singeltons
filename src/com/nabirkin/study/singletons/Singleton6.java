package com.nabirkin.study.singletons;


public class Singleton6 {

    private static Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                Singleton6 singleton6 = instance;
                if (singleton6 == null) {
                    synchronized (Singleton6.class) {
                        singleton6 = new Singleton6();
                    }
                }
                instance = singleton6;
            }

        }
        return instance;
    }
}
