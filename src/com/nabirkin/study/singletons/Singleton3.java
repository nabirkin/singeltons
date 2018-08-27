package com.nabirkin.study.singletons;


public class Singleton3 {


    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }


    private static class SingletonHolder {
        private final static Singleton3 instance = new Singleton3();
    }

}
