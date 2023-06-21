package lesson_7;

public class Main {
    public static void main(String[] args) {
        //Создать класс Person с полями name, age, gender. Поле name сделать public, age
        //оставить по дефолту, gender – private. В классе lesson_18.Main создать объект Person.
        //Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
        //используя геттеры если это возможно

        Person person = new Person();
        Cat cat = new Cat();
        person.setCat(cat);
    }
}
