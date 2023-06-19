package lesson_16.done.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] line = {"man", "moon", "good", "night"};

        Map<String, String> map = new HashMap<>();
        for (String str : line) {
            map.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
        }
        System.out.println(map);
    }
}
