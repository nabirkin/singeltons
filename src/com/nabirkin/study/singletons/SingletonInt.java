package com.nabirkin.study.singletons;

public class SingletonInt {

    private static int code;

    private SingletonInt() {
    }

    public static int code() {
        if (code == 0) {
            synchronized (SingletonInt.class) {
                if (code == 0) {
                    code = calc();
                }
            }
        }
        return code;
    }

    private static int calc() {
        return 99;
    }
}
