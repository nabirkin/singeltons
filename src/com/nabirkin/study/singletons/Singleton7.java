package com.nabirkin.study.singletons;

/**
 *
 * Double Checked Locking & volatile
 * volatile so that the system will not allow a write of a volatile to be reordered with respect to any previous read or write,
 * and a read of a volatile cannot be reordered with respect to any following read or write.
 */
public final class Singleton7 {
    private static volatile Singleton7 instance;

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null) {
                    instance = new Singleton7();
                }

            }
        }
        return instance;
    }

}
