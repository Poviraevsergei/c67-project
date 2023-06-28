package lesson_20.task2;

public class Notifier extends Thread {

    private Monitor monitor;

    public Notifier(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("Начал работу в Notifier: " + Thread.currentThread());
        synchronized (monitor) {
            monitor.notify();
        }
        System.out.println("Завершил работу в Notifier: " + Thread.currentThread());
    }
}
