package lesson_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Bill Gates", 68);

        person1.move();
        person1.talk("Helloooooo");

        person2.move();
        person2.talk("Go home!");
    }
}
