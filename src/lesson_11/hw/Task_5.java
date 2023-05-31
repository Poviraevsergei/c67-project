package lesson_11.hw;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + "" +line.charAt(i));
        }
    }
}