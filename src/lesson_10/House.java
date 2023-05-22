package lesson_10;

import java.util.Objects;

public class House {
    private int cost;
    private String color;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }

}
