package lesson_9;

public class Main {
    public static void main(String[] args) {
        BMW car = new BMW();
        car.signal();

        CarInterface.changeSpeed(5);
    }
}