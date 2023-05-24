package lesson_9.hw.task2;

public class Main {
    public static void main(String[] args) {
        Shape[] array = new Shape[5];
        array[0] = new Triangle(1, 2, 3, 4);
        array[1] = new Circle(3);
        array[2] = new Rectangle(4, 5);
        array[3] = new Triangle(3.4, 2, 4.5, 3);
        array[4] = new Circle(5.5);

        double sum = 0;

        for (Shape shape : array) {
            sum += shape.perimeter();
        }

        System.out.println(sum);
    }
}
