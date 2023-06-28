package lesson_20;

public class MyFirstThread extends Thread {
    @Override
    public void run() { //не путать с start()
        //Все что тут, будет выполняться потоком.
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END!!!");
    }
}
