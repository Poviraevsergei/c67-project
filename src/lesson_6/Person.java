package lesson_6;

public class Person {
    String fullName;
    int age;
    private String name = "Alex";

    public String getName() {
        return name;
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String text) {
        System.out.println(fullName + " talk: " + text);
    }

    void move() {
        System.out.println(fullName + " walk.");
    }
}