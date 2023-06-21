package lesson_17.done.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dateUser = LocalDate.parse(new Scanner(System.in).nextLine());
        System.out.println(dateUser.plusYears(100));
    }
}
