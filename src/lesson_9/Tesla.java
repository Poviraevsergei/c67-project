package lesson_9;

public class Tesla implements CarInterface{
    
    @Override
    public void start() {
        System.out.println("FAST START TESLA!");
    }

    @Override
    public void stop() {
        System.out.println("FAST STOP TESLA!");
    }
}
