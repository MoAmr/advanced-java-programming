package threads.deadlock_example;

public class Kitchen {

    /**
     * Note: A deadlock can occur when two or more threats get blocked forever.
     * For example, this can happen when two threats are both waiting for
     * resources held by each other.
     */

    /**
     * In this example, I am simulating a situation with two cooks in a kitchen.
     * Imagine if both cooks wanted to mix some ingredients, so they both need a spoon and a bowl.
     * However, there is only one spoon and one bowl. The first cook picks up the spoon and at the same time,
     * the second cook picks up the bowl. Now both cooks are waiting for the other one to put down their object
     * so they can pick it up. This is a deadlock.
     */

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {

        /**
         * Inside the first thread is a synchronized block. A synchronized block or synchronized statement is a section
         * of codes that only one thread can enter at a time. This means that you can have synchronized code inside
         * a non synchronized method. The object in brackets is known as a monitor object. And this means that
         * if a thread is inside the synchronized block, no other thread can do anything with that object.
         */

        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (bowl) {
                System.out.println("cook2: Holding the bowl...");
                System.out.println("cook2: Waiting for the spoon...");

                synchronized (spoon) {
                    System.out.println("cook2: Holding the spoon and the bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
