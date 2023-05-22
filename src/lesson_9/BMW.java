package lesson_9;

public class BMW extends Car implements CarInterface, SoundInterface, FirstFunctionalInterface {  //имплементация

    @Override
    public void start() {
        System.out.println("BMW START MOVING!");
    }

    @Override
    public void stop() {
        System.out.println("BMW STOP....");
    }

    @Override
    public void signal() {
        CarInterface.super.signal();
    }

    @Override
    public void makeSound(String songName) {
        System.out.println("Playing " + songName);
    }

    @Override
    public int shouldBeOneMethod() {
        return 0;
    }
}