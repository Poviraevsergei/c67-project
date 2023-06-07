package lesson_13;

public class AgeException extends Exception {

    private int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "You use " + age + ", but need < 18 :((" ;
    }
}
