package lesson_12.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line:");
        String str = scanner.nextLine();
        String[] words = str.split(" +");

        for (String word : words) {
            if (word.matches("[A-ZА-Я]{2,6}")) {
                System.out.println(word);
            }
        }
    }
}
