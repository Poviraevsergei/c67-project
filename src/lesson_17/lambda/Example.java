package lesson_17.lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {
        ////1. create lambda
        //FunInterface firstLambda = (a, b) -> a + b;
        //FunInterface secondLambda = (a, b) -> a - b;

        //UnaryOperator<Integer> firstLambdaUnary = (a) -> a * a; //принимает 1 параметер
        //BinaryOperator<Integer> firstLambdaBinary = (a, b) -> a + b; //принимает 2 параметра
        //Predicate<Integer> pl = (number) -> number % 2 == 0; //принимает значение, возвращет true/false
        //Consumer<Integer> cl = (a) -> System.out.println(a); //принимает параметр, но не возвращает результат
        //Supplier<Integer> sl = () -> {
        //    Scanner scanner = new Scanner(System.in);
        //    return scanner.nextInt();
        //}; // не принимает параметр, но возвращает значение
        //Function<String, Integer> fl = (a) -> Integer.parseInt(a); //принимает тип Т, возвращает R

        //2. use lambda
        //long result = firstLambdaBinary.apply(10, 20);
        //System.out.println(result);

        //При помощи лямбда выражения реализовать логику, при которой, если а < b, то
        //вернуть а. Если a > b, то вернуть b. Иначе вернуть 0.

        BinaryOperator<Integer> lambda = (x, y) -> {
            if (x > y) {
                return y;
            }
            if (x < y) {
                return x;
            }
            return 0;
        };

        System.out.println(lambda.apply(10, 10));
    }
}
