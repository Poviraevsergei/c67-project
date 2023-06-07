package lesson_13.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        user.setLogin(scanner.nextLine());
        System.out.println("Enter password: ");
        user.setPassword(scanner.nextLine());
        System.out.println("Enter confirm password: ");
        user.setConfirmPassword(scanner.nextLine());
        try {
            System.out.println(User.enter(user.getLogin(), user.getPassword(), user.getConfirmPassword()));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
    }
}
