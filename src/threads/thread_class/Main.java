package threads.thread_class;

public class Main {

    public static void main(String[] args) {

        // Multiple Threads Program 
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My First Thread");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My Second Thread");
        thread2.start();
    }
}
