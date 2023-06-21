package lesson_17.done.task3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "100 BYN";
        Function<String, Double> function = (line) -> Double.parseDouble(line.replaceAll(" BYN", "")) / 2.98;
        System.out.println(function.apply(str) + " USD");
    }
}