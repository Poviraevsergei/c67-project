package lesson_8;

public class Developer {
    public static String name;
    public final static double PI = 3.14; //статичное(пренадлежит класу)
    protected final int age;

    public Developer(int age) {
        this.age = age;
        System.out.println("WORD CONSTRUCTOR DEVELOPER");
    }

    static {
        name = "Alex";
    }

    {
        System.out.println("Hello from logic block DEVELOPER");
    }

    //статические методы могу использовать только статические переменные
    public static void sayHelloAndYourName() {
        System.out.println("Hello");
        System.out.println(PI);
    }

    static class Laptop{
        public static String name = "HP";
    }
}
