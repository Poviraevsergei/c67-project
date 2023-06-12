package lesson_15;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
 /*       //Уникальные эл-ты
        //Хаотивно добавляет

        // HashSet<Integer> хэш таблицах - Быстрый поиск
        Set<String> list = new HashSet();
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //хранит порядок добавления
        LinkedHashSet<String> list1 = new LinkedHashSet<>();
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        System.out.println(list1);

        TreeSet<String> list2 = new TreeSet<>(new MyComporator());
        list2.add("one");
        list2.add("Blala");
        list2.add("aaaaa");
        list2.add("ccccc");
        list2.add("bbbbb");
        list2.add("ddddd");
        list2.add("eeeee");
        list2.add("o");
        System.out.println(list2);
        System.out.println(list2.comparator());*/

        //    Задача 3:
        //    3.1 Создать класс Person.
        //    3.2 Создать HashSet в классе Main.
        //    3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
        //    3.4 Удалить 2 объекта из коллекции.
        //    3.5 Проверить, содержится ли оставшийся объект в коллекции.
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();

        HashSet<Person> list = new HashSet<>();
        list.add(p);
        list.add(p1);
        list.add(p2);

        for (Person o : list){
            System.out.println(o);
        }

        list.remove(p);
        list.remove(p1);
        System.out.println(list.contains(p2));
    }
}
