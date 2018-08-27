package com.nabirkin.study.singletons;

/**
 *
 * Threadsafe and not lazy, but slow.
 * We need the synchronize block only once.
 *
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
