package lesson_16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("FirstKey", 100); //положить
        map.put("USD", 296);

        System.out.println(map.get("SecondKey"));

      //  map.clear();
        Set<String> resultKeys = map.keySet(); //достать все ключи
        System.out.println(resultKeys);
        ArrayList<Integer> r = new ArrayList<>(map.values()); //достать все значения в ArrayList
        System.out.println(r);
        System.out.println(map.containsKey("123"));
        System.out.println(map.containsValue("123"));
        System.out.println(map.size());
        System.out.println(map.replace("USB",123)); //заменить

        System.out.println(map);
    }
}
