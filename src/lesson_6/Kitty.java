package lesson_6;

public class Kitty {
    //1. Состояние (характеристики):color
    String color;
    String breed;
    String name;
    int age;
    int weight;

    //Конструктор по умолчанию (Удаляется если есть другие конструкторы(нужно явно прописать))
    public Kitty() {
    }

    //Code - Generate - constructor
    public Kitty(String color, String breed, String name, int age, int weight) {
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //2. Поведение (метод) (что он умеет): мяукать, бегать

    //чтоМетодОтдаетКакРезультат имя(параменты){
    //  тело метода
    //}

    void makeVoice() {
        System.out.println("Meow meow!!!");
    }

    int giveMeAgePlusOneYear() {
       return age + 1;
    }

    void printAgePlusOneYear() {
        System.out.println(age + 1);
    }
}


