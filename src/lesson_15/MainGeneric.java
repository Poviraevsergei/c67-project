package lesson_15;

import lesson_9.A;

import java.util.ArrayList;

public class MainGeneric {
    public static void main(String[] args) {
        GenericExample<Person> o1 = new GenericExample<>();
        GenericExample<Integer> o2 = new GenericExample<>();

        GenericExample.printGenHashCode(o1);
        GenericExample.printGenHashCode(o2);

        ArrayList<String> list = new ArrayList();
    }

    static <T> Integer hashSum(T... objects) {
        int summ = 0;
        for (T o : objects) {
            summ = summ + o.hashCode();
        }
        return summ;
    }
}
