package lesson_11;

public class Main {
    public static void main(String[] args) {
        String line = "    Group 671!    we are good    ";

        //System.out.println(line.length()); //длинна
        //System.out.println(line.trim()); //убирает пробелы по краям
        //System.out.println(line.stripLeading()); //убирает пробелы слева
        //System.out.println(line.stripTrailing()); //убирает пробелы справа
        //System.out.println(line.charAt(3)); //символ по индексу
        //System.out.println(line.indexOf("o")); //первое вхождение символа в строке
        //System.out.println(line.concat("We are learning Java!")); //Конкатенация строк
        //System.out.println(line.substring(3)); //с 3 индекса и до конца
        //System.out.println(line.substring(2,5)); //c 2 по 5
        //System.out.println(line.equals("Group 67")); //сравнивание строк
        //System.out.println(line.equalsIgnoreCase("group 67!")); //сравнивание строк игнорируя регистр
        //System.out.println(line.compareTo("Group 67!")); //символьное сравнение строк
        //System.out.println(line.toUpperCase()); //привести в верхний регистр
        //System.out.println(line.toLowerCase()); //привести в нижний регистр
        //System.out.println(line.replace("67","8"));
        //System.out.println(line.replaceAll("[0-9]{3}","8")); //может принимать регилярные выражения
        //System.out.println(Arrays.toString(line.getBytes())); //преобразовать в byte[]
        //System.out.println(Arrays.toString(line.toCharArray())); //преобразовать в массив символов
        //System.out.println(Arrays.toString(line.split(" "))); //разделяем на подстроки по делителю
        //System.out.println(line.startsWith("Group")); //проверка, начинается ли строка с ...
        //System.out.println(line.endsWith("!")); //проверка, заканчивается ли строка на ...
        //System.out.println(line.contains("Gr")); //проверка, содержит ли строка ...
        //System.out.println("   ".isEmpty()); //проверяет на пустоту строки(length == 0)
        //System.out.println("   ".isBlank()); //не учитывает пробелы
        //System.out.println(line.repeat(3)); //повторяет строку n раз
        //System.out.println(line.intern()); //перекладывает обьект из Heap в String pool
        //String six = String.valueOf(6); //"6"
        //String seven = String.valueOf(7); //"7"
        //System.out.println(six + seven);

        //String block = """
        //        Hello world!
        //        How are you??
        //        """;

        StringBuilder strBuildLine = new StringBuilder("Hello world!");
        strBuildLine.append("This is end of line!"); //добавить в конец
        strBuildLine.delete(4, 7); //удалить
        strBuildLine.deleteCharAt(4); //удалить 1 символ
        strBuildLine.insert(3, "BYE"); //вставить в середину
        strBuildLine.reverse();
        String lineFromSB = strBuildLine.toString();
        System.out.println(strBuildLine);

        //StringBuffer используется в многопоточной среде
        StringBuffer strBuffLine = new StringBuffer("Hello world!");
    }
}
