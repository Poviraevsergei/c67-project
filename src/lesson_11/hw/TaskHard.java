package lesson_11.hw;

import java.util.Scanner;

public class TaskHard {
    public static void main(String[] args) {
        String string = "hello world! 121 666 7878787 0000 9999 990099";
        String[] words = string.split(" ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber <= words.length && (inputNumber > 0)) {
                StringBuilder stringBuilder = new StringBuilder(words[inputNumber - 1]);
                System.out.println(stringBuilder);
                if (stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString())) {
                    System.out.println("The string is a palindrome");
                } else {
                    System.out.println("The string is not a palindrome");
                }
            } else {
                System.out.println("There is no such word in string");
            }
        } else {
            System.out.println("Incorrect input, must be Integer");
        }
    }
}