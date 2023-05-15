package lesson_7;

public class Build {
/*    // public - доступно везде
    public String type;*/

/*    // - по умолчанию
    String type;*/

/*    // private - в пределах класса
    private String type;*/

/*    // protected - в пределах пакета, а наследники в других пакетах
    protected String type;*/

    private String color; //BLUE

    //достать значение ( НЕ ЗАМЕНЯТЬ!! )
    public String getColor() {
        return color;
    }

    //записать что-то в поле
    public void setColor(String color) { //BLUE
        this.color = color;
    }

    //Геттеры, Сеттеры - методы для доступа к полям
}
