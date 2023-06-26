package lesson_18.done;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskStar {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Harry");
        map.put(2, "Oliver");
        map.put(3, "Charlie");
        map.put(4, "Thomas");
        map.put(5, "Jack");
        map.put(6, "Jacob");
        map.put(7, "Alfie");
        map.put(8, "Riley");
        map.put(9, "William");
        map.put(10, "James");
        map.put(11, "Amelia");
        map.put(12, "Olivia");
        map.put(13, "Emily");
/*        List<String> list = map.keySet().stream()
                .filter(x -> x == 1 || x == 2 || x == 5 || x == 8 || x == 9 || x == 13)
                .map(map::get)
                .filter(s -> s.length() % 2 != 0)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(list);*/

/*        List<String> list = map.entrySet().stream()
                .filter(a -> a.getKey().toString().matches("([12589])|13"))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(Map.Entry::getValue)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList();*/

        List<String> list = map.entrySet().stream()
                .filter(a -> a.getKey().toString().matches("([12589])|13"))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(Map.Entry::getValue)
                .map(e -> new StringBuilder(e).reverse().toString())
                .toList();

        System.out.println(list);
    }
}
