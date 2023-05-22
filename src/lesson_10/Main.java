package lesson_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//toString() - преобразовать обьект в строку

        House house = new House();
        house.setCost(1000_000);
        house.setColor("White");

        House secondHouse = new House();
        house.setCost(1);
        house.setColor("Black");

        System.out.println(house.hashCode());
        System.out.println(secondHouse.hashCode());

        //Коллизия
    }
}
