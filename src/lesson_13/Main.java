package lesson_13;

import lesson_9.A;

public class Main {
    public static void main(String[] args) throws AgeException {
/*        //подключаемся к бд
        //try-catch
        int number = 0;

        try {
            System.out.println(10 / number);
        } catch (ArithmeticException | StackOverflowError e) {
            System.out.println("Some arithmetic exception:" + e);
        }

        System.out.println("End of main method");

        int[] array = {1, 2, 3};

        try {
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println(1111111);
        }
        int number = 1;

        if (number > 0) {
            throw new AgeException("more than 0");
        }
        */
        //Создать собственное исключение которое будет выбрасываться в классе Person при
        //создании объекта, если ему меньше 18 лет.

        // Попробовать создать объект Person до и
        //после 18 лет в методе main.


            Person person = new Person(19);
    }
}
