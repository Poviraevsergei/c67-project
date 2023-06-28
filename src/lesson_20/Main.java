package lesson_20;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*        //System.out.println(Thread.currentThread());
        System.out.println("Поток main начинает свою работу");

        for (int i = 0; i < 20; i++) {
            MyFirstThread mft = new MyFirstThread();
            mft.start();
            mft.join(); //поток-создатель ожидает завершения созданного потока
        }

        System.out.println("Поток main завершает свою работу");
        //анонимный класс, если не хотим создавать шаблон
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Multithreading :)");
            }
        };
        t.start();

        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("My thread");
            }
        };
        t.start();
        t.setName("c65-thread"); // задаем название
        t.setPriority(10); //задаем приоритет
        System.out.println(t.getId());
        System.out.println(t);

        Thread thread = new Thread(new MySecondThread());
        thread.start();
        MyFirstThread myFirstThread = new MyFirstThread();
        System.out.println(myFirstThread.isAlive());
        myFirstThread.start();
        System.out.println(myFirstThread.isAlive());
        System.out.println(myFirstThread.isInterrupted());
        myFirstThread.interrupt();

        InteraptTest interaptTest = new InteraptTest();
        interaptTest.setDaemon(true); //перед стартом
        interaptTest.start();

        Thread.sleep(5000);

        //  interaptTest.interrupt();

        InteraptTest interaptTest = new InteraptTest();
        interaptTest.start();
        Thread.sleep(3000);
        interaptTest.interrupt();*/

    }
}
