package lesson_20.task;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
         Thread counterThread = new Thread(new CounterThread(counter));
         counterThread.start();
        }
    }
}
