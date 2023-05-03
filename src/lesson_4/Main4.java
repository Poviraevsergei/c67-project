package lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 7};
        int[] finalArray = {0, 0, 0, 0, 0, 0, 0};

/*      //TODO: forEach (не умеет сохранять изменения)
        for (переменная в которую записываем : что хотим перебрать){
        }

        for (int number : array) {
            System.out.println(number);
        }

        //TODO: Arrays
        //в строку из массива
        String arrayByLine = Arrays.toString(array); // "[1, 4, 6, 7, 8]"
        System.out.println(arrayByLine);

        //сортировка массива
        Arrays.sort(array);

        //поиск эл-та (массив должен быть отсортирован)
        System.out.println(Arrays.binarySearch(array,7));

        //копирование эл-ов массива в другой (не Arrays класс!)
        System.arraycopy(array, 1, finalArray, 1, 2);

        //сравнивание одномерных массивов
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(Arrays.equals(a, b));


        //TODO: Многомерные массивы
        //прямоугольные
        //  int[][] binArray = new int[3][4]; //строки и столбиков

        //зубчатые
        // int[][] binArray = {{0, 0, 0, 0}, {0, 0, 1}}; //строки и столбиков

        //зубчатые(авто)
        int[][] binArray = new int[3][]; //строки и столбиков
        binArray[0] = new int[5];
        binArray[1] = new int[2];
        binArray[2] = new int[3];

        System.out.println(Arrays.deepToString(binArray)); //вывод многомерного массива

        System.out.println(binArray[2].length); //кол-во эл-ов в 3 строке

        // сравнивание многомерных массивов
        int[][] a = new int[1][1];
        int[][] b = new int[1][1];
        System.out.println(Arrays.deepEquals(a, b));

        //Перебрать эл-ты многомерного массива
        int[][] binArray = {{9, 3, 100, 16}, {7, 3, 1}};

        for (int i = 0; i < binArray.length; i++) {
            for (int j = 0; j < binArray[i].length; j++) {
                System.out.print(binArray[i][j] + " ");
            }
            System.out.println();
        }

        //Перебор через forEach
        for (int[] line : binArray) {
            for (int element : line) {
                System.out.println(element);
            }
        }*/

        // Создайте двухмерный массив и заполните его псевдослучайными
        // числами с помощью класса Random.
        int[][] resultArray = new int[5][5];
        Random random = new Random();
        random.nextInt();

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = random.nextInt(10);
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }

        // Найдите максимальное значение в созданном 2-мерном массиве.
        int max = resultArray[0][0];
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                if (resultArray[i][j] > max){
                    max = resultArray[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
