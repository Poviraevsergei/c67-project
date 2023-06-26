package lesson_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //   //create of()
        //   Stream.of(10, 20, 30, 40, 50);

        //   //create коллекции
        //   ArrayList<String> list = new ArrayList<>();
        //   list.stream();

        //   //create array
        //   int array[] = {10, 20, 30, 40, 50};
        //   Arrays.stream(array);
        List<String> res = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 50)

                //конвеерные методы
                .filter(num -> num > 25)
                .skip(2) //пропустить n элементов
                .distinct() // убрать дубликаты
                .peek(p -> Math.round(p)) //выполняет методы наши
                .limit(3) // пропускает n элементов дальше
                .sorted() // сортировка
                .map(n -> n + " USD") //преобразует
                .flatMap(a -> Arrays.stream(a.split(" "))) //разбивает

                //терминальные
                //.forEach(a -> System.out.println(a));
                //.findFirst();
                //.findAny();
                .collect(Collectors.toList());
                //.collect(Collectors.toSet());
                //.count();
                //.anyMatch(a -> a.equals("USD"));
                //.noneMatch()
                //.allMatch(a -> a.length() > 1);
                //.min(Integer::compare);
                //.max(Integer::compare);
                //.toArray(String[]::new);
                //.toArray(value -> new String[value]);
                //.reduce((a,b) -> a + b + "H");

        System.out.println(res);
    }
}
