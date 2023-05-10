package lesson_6;

public class Calculator {
    double weight;
    int cost;
    String color;

    public Calculator(double weight, int cost, String color) {
        System.out.println("Выполняется конструктор");
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    long findSum(int a, int b) {
        return a + b;
    }

    static {
        System.out.println("Статический блок");
    }

    {
        System.out.println("Первый ЛБ: Мы создаем калькулятор!");
    }

    {
        System.out.println("Второй ЛБ: Мы создаем калькулятор!");
    }

    double findDel(int a, int b) {
        return (double) a / b;
    }

    int findRazn(int a, int b) {
        return a - b;
    }

    long findMult(int a, int b) {
        return (long) a * b;
    }
}