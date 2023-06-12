package lesson_14.hw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/tms/Desktop/romeo-and-juliet.txt");
        int i;
        StringBuilder txt = new StringBuilder();
        while ((i = fileReader.read()) != -1) {
            txt.append((char) i);
        }
        fileReader.close();
        String[] arr = txt.toString().split("\\W");
        String max = arr[0];
        for (String word : arr) {
            if (word.length() > max.length()) {
                max = word;
            }
        }
        System.out.print("The longest word: " + max);
        System.out.print("Length: " + max.length());

        FileWriter fw = new FileWriter("/Users/tms/Desktop/max.txt");
        fw.write(max);
        fw.close();
    }
}
