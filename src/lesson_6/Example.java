package lesson_6;

public class Example {

    void someMethod(int name, int ... numbers){ //тебе передадут массив
        for (int a : numbers){
            System.out.println(a);
        }
    }

}
