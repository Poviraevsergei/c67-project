package lesson_19;

public record RecordDog(String name, Integer age, String color) {
    static int num = 10;

    public RecordDog(int age) {
        this("Dima", age, "Red");
    }
}
