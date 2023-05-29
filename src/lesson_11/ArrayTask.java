package lesson_11;

public class ArrayTask {
    public static void main(String[] args) {
        int n = 10;

        int[] array = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        int[] newArray = new int[n + 1];
        int sum = 0;
        int sumSecond = 0;

        for (int i = 0; i < array.length + 1; i++) {
            newArray[i] = i;
            sumSecond = sumSecond + newArray[i];
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Пропущенное число: " + (sumSecond - sum));
    }
}
