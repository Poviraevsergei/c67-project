package lesson_20;

public class MySecondThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Second thread working ...");
    }
}
