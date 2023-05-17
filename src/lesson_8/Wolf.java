package lesson_8;

public class Wolf extends Animal{

    //Переопределение метода makeSound()
    @Override   //аннотация
    void makeSound() {
        System.out.println("Wow wow");
    }
}
