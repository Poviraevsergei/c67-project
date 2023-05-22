package lesson_9;

//Абстрактные класс - МОЖЕТ иметь абстрактные методы
public abstract class Fruit { //этот класс не может создавать обьекты!!!
    private int cost;

    public Fruit(int cost) {
        this.cost = cost;
    }

    abstract void describeTaste(); //абстрактный метод
}
