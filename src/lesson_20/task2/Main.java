package lesson_20.task2;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        Waiter waiter = new Waiter(monitor);
        waiter.start();
/*
        Notifier notifier = new Notifier(monitor);
        notifier.start();*/
    }
}
