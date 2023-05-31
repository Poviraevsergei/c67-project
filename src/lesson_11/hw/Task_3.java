package lesson_11.hw;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //3. Ввести 3 строки с консоли.
        // Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину.









        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        int sumLength = 0;
        System.out.println("Enter " + array.length + " strings: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
            sumLength += (array[i].length());
        }
        for (String string : array) {
            if (string.length() < Math.round((double) sumLength / array.length)) {
                System.out.println("String with length lower than average: " + string + "; length: " + string.length());
            }
        }
    }
}