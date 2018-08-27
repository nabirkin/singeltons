package com.nabirkin.study.singletons;

/**
 *
 * Threadsafe and not lazy, not slow.
 *
 * But the instance can became not null at the moment when not all fields of the instance are assignment
 * Initialize the {@link com.nabirkin.study.singletons.Singleton5} object and the write to the instance field can be done or perceived out of order,
 * so other thread can come and sees instance is not null and then starts to use it.
 *
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 *
 */
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
