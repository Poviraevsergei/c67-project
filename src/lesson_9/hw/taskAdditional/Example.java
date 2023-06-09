package lesson_9.hw.taskAdditional;

public class Example implements Cloneable {
    private String name;

    public Example(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Example clone() throws CloneNotSupportedException {
        return (Example) super.clone();
    }
}
