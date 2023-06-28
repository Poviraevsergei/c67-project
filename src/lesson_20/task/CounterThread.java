package lesson_20.task;

public class CounterThread implements Runnable {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "начал работу");
        synchronized (counter) {
            counter.setCounter(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCounter());
                counter.increase();
            }
        }
        System.out.println(Thread.currentThread() + "завершил работу");
    }
}
