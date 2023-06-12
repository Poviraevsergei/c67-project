package lesson_15;

import java.util.Comparator;

public class MyComporator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return o1.compareTo(o2);
        }
    }
}
