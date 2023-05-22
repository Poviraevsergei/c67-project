package lesson_9;

@FunctionalInterface//ставится над интерфейсами с одним абстрактным методом
public interface FirstFunctionalInterface {
    int shouldBeOneMethod(); //Главно что 1 абстрактный

    //default может быть сколько угодно
    default void hello(){
        System.out.println("Default realization");
    }
}