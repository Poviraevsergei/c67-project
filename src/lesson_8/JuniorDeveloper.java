package lesson_8;

public class JuniorDeveloper extends Developer{

    {
        System.out.println("Hello from logic block JuniorDeveloper");
    }

    static {
        System.out.println("Static block JuniorDeveloper");
    }

    public JuniorDeveloper(int age) {
        super(age);
    }
}