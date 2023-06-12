package lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        // Динамический массив
        // Может хранить дубликаты
        // Время доступа к элементу O(1) - очень быстро
        // Хранит элементы в порядке добавления
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> arrayList = (ArrayList<String>) Arrays.asList("1","2");
        ArrayList<String> list2 = new ArrayList<>() {{
            add("C");
            add("C++");
            add("Java");
        }};
        list.add("Hello");
        list.add("World");
        list.add("67");
        list.add("Group");
        list.add("67");

        System.out.println(list.remove("67"));
        System.out.println(list.set(1,"NEW_VALUE"));
        System.out.println(list);
        String[] resultLust =  list.toArray(new String[0]);

        for (String l : resultLust){
            System.out.println(l);
        }
/*        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("Hello"));
        System.out.println(list.contains("Hello"));
        System.out.println(list.size());
        System.out.println(list.addAll(list2));
        System.out.println(list.get(3));*/
    }
}
