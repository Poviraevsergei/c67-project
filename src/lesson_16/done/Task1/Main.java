package lesson_16.done.Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] line = {"a", "b", "a", "c", "a"};

        Map<String, Boolean> map = new HashMap<>();
        for (String str : line) {
            if (map.containsKey(str)) {
                map.replace(str, true);
            } else {
                map.put(str, false);
            }
        }
        System.out.println(map);
    }
}
