package lesson_17.done.task4;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        String str = "100 BYN";
        Consumer<String> consumer = (line) -> System.out.println(Double.parseDouble(line.replaceAll(" BYN", "")) / 2.98 + " USD");
        consumer.accept(str);
    }
}