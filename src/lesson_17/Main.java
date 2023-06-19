package lesson_17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.MAX;
        System.out.println(dateNow);
        //LocalDate date = LocalDate.of(1890,2,3);
        //LocalDate date = LocalDate.parse("2033-01-01");
        //LocalDate date = LocalDate.parse("2033-01-01");
        //date = date.plusYears(1);
        //date = date.minusDays(10);
        //date = date.minus(1, ChronoUnit.MILLENNIA);
        //System.out.println(date.getDayOfWeek());
        //System.out.println(date.getDayOfMonth());
        //System.out.println(date.isLeapYear()); //проверка на весокосный

        //System.out.println(date.isAfter(dateNow));
        //System.out.println(date.isBefore(dateNow));

        //Написать программу для вывода на консоль названия дня недели по введенной дате.
        //Scanner scanner = new Scanner(System.in);
        //String ourDate = scanner.nextLine();
        //LocalDate resultDay = LocalDate.parse(ourDate);
        //System.out.println(resultDay.getDayOfWeek());

        ////Задача 2:
        ////Написать программу для вывода на экран дату следующего вторника
        //LocalDate date = LocalDate.now();
        //do {
        //    date = date.plusDays(1);
        //} while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY));
//
        //System.out.println(date);
        //System.out.println(LocalTime.MAX);
        //System.out.println(LocalDateTime.now());
        //System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        LocalDate d = LocalDate.now();
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

    }
}