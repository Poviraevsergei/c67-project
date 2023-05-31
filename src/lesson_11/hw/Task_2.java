package lesson_11.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //2. Ввести 3 строки с консоли.
        // Упорядочить и вывести строки в порядке возрастания значений их длины.
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Enter " + array.length + " strings: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        Arrays.sort(array, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(array));
    }
}

