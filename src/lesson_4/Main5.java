package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        System.out.println("Полученный массив:");
        for (int[] row : a) {
            for (int element : row) {
                element += n;
                System.out.println(element);
                System.out.println(element);
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(a));
    }
}
