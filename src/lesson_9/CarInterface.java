package lesson_9;

public interface CarInterface {
    //список методов, которые должны быть реализованы в классе
    //который имплементирует этот интерфейс
    //НЕЛЬЗЯ СОЗДАВАТЬ ОБЬЕКТЫ!

    public final static int WHEELS_COUNT = 4; //ctrl + shift + U

    //Все методы public
    public void start(); // Абстрактные метод

    void stop();

    //default - описание метода(можно не переопределять)
    default void signal(){
        privateMethod1();
        privateMethod2();
    }

    static void changeSpeed(int a){
        System.out.println("This is static method");
    }

    //Можем использовать в default блоке
    private void privateMethod1(){
        System.out.println("This is private method.100");
    }

    private void privateMethod2(){
        System.out.println("This is private method.200");
    }
}