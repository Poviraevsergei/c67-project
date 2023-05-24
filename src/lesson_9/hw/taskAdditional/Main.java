package lesson_9.hw.taskAdditional;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Example example = new Example("example");
        Example exampleCloned = example.clone();
        System.out.println("Example name: " + example.getName() + "\nExampleCloned name: " + exampleCloned.getName());
    }
}
