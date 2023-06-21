package lesson_18;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Optional
        Optional<Object> firstOptional = Optional.empty();

        Optional<String> strLine = Optional.of("OLA"); //Если уверены что обьект не null

        //  //Check is empty or not
        //  System.out.println(strLineNull.isPresent());
        //  System.out.println(strLineNull.isEmpty());

        String line = "group67";
        Optional<String> strLineNull = Optional.ofNullable(line);

        //run some code
        strLineNull.ifPresent(param -> System.out.println(param)); // выполняет действие если optional не пустой

        // open Optional
        String result3 = strLineNull.get();
        String result = strLineNull.orElse("DEFAULT_VALUE");
        String result2 = strLineNull.orElseGet(() -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        });
        String result4 = strLineNull.orElseThrow();
        String result5 = strLineNull.orElseThrow(() -> new ArithmeticException());

        //filter()
        Optional<String> res = strLineNull.filter(value -> value.equals("group67"));
        //if filter true -> Optional с обьектом
        //if filter false -> Optional.empty();

        System.out.println(res);

        //map() принимает значение и отдает другое
        int mapResult = strLineNull.map(value -> value.length()).orElse(0);
        System.out.println(mapResult);

        //Создать класс User с послем name. В Main создать поле user типа User.
        //Заранее мы не знаем лежит там обьект или отсутствует.
        //Написать логику, которая будет выводить имя пользователя если обьект присутствует в
        //user, либо ‘DEFAULT’ в противном случае. Использовать класс Optional.

        User user = new User();
        user.setName("Sasha");
        Optional<User> userOp = Optional.ofNullable(user);
        String taskResult = userOp.map(u -> u.getName()).orElse("DEFAULT");
        System.out.println(taskResult);
    }
}
