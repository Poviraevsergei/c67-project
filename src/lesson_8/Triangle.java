package lesson_8;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("I draw Triangle");
    }

    @Override
    public void erase() {
        System.out.println("I erase Triangle");
    }
}
