package lesson_9;

public class Main {
    public static void main(String[] args) {
/*        //Интерфейсная ссылка
        CarInterface car = new BMW();   //BMW Tesla
        car.start();
        car.stop();*/

        Voice cat = new Cat();
        cat.doVoice();
    }
}