package lesson_20;

import java.time.LocalTime;

public class InteraptTest extends Thread {

    int a = 1;

    @Override
    public void run() {
        while (!isInterrupted()) { //isInt - true     !  -> false
            System.out.println("Поток работает " + LocalTime.now());
        }
        System.out.println("Поток закрывается ...");
    }
}
