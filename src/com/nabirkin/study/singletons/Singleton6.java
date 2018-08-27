package com.nabirkin.study.singletons;


/**
 *
 * Threadsafe and not lazy, not slow.
 *
 * The intuitive idea here is that there should be a memory barrier at the point where synchronization is released,
 * and that should prevent the reordering of the initialization of the Helper object and the assignment to the field helper.
 * Unfortunately, that intuition is absolutely wrong.
 *
 * However, there is no rule which says that actions after the monitorexit may not be done before the monitor is released.
 * It is perfectly reasonable and legal for the compiler to move the assignment instance = singleton6 inside the synchronized block
 *
 */
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
