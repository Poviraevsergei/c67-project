package lesson_10;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //toString() - преобразовать обьект в строку

        House house = new House();
        house.setCost(1000_000);
        house.setColor("White");
        house.setDog(new Dog());
        house.getDog().setName("Misha");

        House house1 = new House();
        house1.setCost(1000_000);
        house1.setColor("White");

        //equals о умолчанию сравнивает ссылки обьектов(НЕ ПО ПОЛЯМ).
        System.out.println(house == house1);
        System.out.println(house.equals(house1));

        //equals переопределенный сравнивает значения палей объекта
        //equals & hashCode контракт.


        //Clone (глубокое клонирование)
        House newHouse = (House) house.clone(); //Object -> House
        System.out.println(house.getDog().getName());
        System.out.println(newHouse.getDog().getName());

        newHouse.getDog().setName("Dima");

        System.out.println(house.getDog().getName());
        System.out.println(newHouse.getDog().getName());

        //getClass методанные класса. Рефлексия.
        Class metaInfo = house.getClass();

        Class[] interfaces = metaInfo.getInterfaces();

        for (Class classInterface : interfaces) {
            System.out.println(classInterface.getName());
        } //Iterator

        System.out.println(new Date().getTime());
    }
}
