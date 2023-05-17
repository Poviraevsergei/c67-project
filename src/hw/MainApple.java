package hw;

import java.lang.reflect.Field;

public class MainApple {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.show();
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "Red");
        apple.show();
    }
}
