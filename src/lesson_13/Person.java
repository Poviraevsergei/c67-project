package lesson_13;

import java.util.Scanner;

public class Person {
    private int age;

    public Person(int age) {
        if (age < 18) {
            try {
                throw new AgeException(age);
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
