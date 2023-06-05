package lesson_12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //String testLine = "Hello world!";

        //String pattern = "[A-z]+";

        //System.out.println(testLine.replaceAll(pattern,"1"));
        //System.out.println("Hello\nWorld!");
        //System.out.println("Hello\tWorld!");
        //System.out.println("Hello World!");
        //
        //1. Написать метод который сможет вернуть все цифры из строки:
        //“Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.
        //2. Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1
        //задания.
        //3. Написать метод который сможет вернуть инсту в строке из 1 задания.
        //4. Написать метод который возвращает true если строка имеет вид “null”.
        //5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
        //6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
        //найти имя и фамилию человека и вывести на экран!

        String testLine = "Всем привет!! Меня " +
                "зовут Билл Гейтс и я мечтаю учиться в " +
                "TeachMeSkills!";

        //Pattern pattern = Pattern.compile("\\d+"); task1
        //Pattern pattern = Pattern.compile("@[a-z]+"); task 3
        //Pattern pattern = Pattern.compile("^null$"); task 4
        //Pattern pattern = Pattern.compile("\n+"); task 5
        //Pattern pattern = Pattern.compile("\n+"); task 5
/*        Pattern pattern = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");

        Matcher matcher = pattern.matcher(testLine);
        while (matcher.find()) {
            System.out.println(matcher.end());
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        String[] words = str.split(" +");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (word.matches("[А-Я]{2,6}")){
                //как добавить что бы запятую не читало?
                System.out.println(word);
            }
        }
    }
}
