package lesson_15;

public class GenericExample<T1> {
    private T1 value;

    public T1 getValue() {
        return value;
    }

    static void printGenHashCode(GenericExample o) {
        System.out.println(o.hashCode());
    }

    public void setValue(T1 value) {
        this.value = value;
    }
}