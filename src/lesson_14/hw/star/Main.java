package lesson_14.hw.star;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());           // src\\Lesson_14\\homework\\taskAdditional\\docNumber.txt
        try (FileReader fr = new FileReader(file);
             FileWriter fileValidWriter = new FileWriter("/Users/tms/Desktop/validDocNums.txt", true);
             FileWriter fileInvalidWriter = new FileWriter("/Users/tms/Desktop/notValidDocNums.txt", true)) {
            int i;
            StringBuilder newLine = new StringBuilder();
            while ((i = fr.read()) != -1) {
                newLine.append((char) i);
            }
            String[] result = newLine.toString().split("\n");
            for (String line : result) {
                if (line.matches("docnum\\w{9}") || line.matches("contract\\w{7}")) {
                    fileValidWriter.write(line + "\n");
                } else {
                    fileInvalidWriter.write(line + " - not valid\n");
                }
            }
            System.out.println("Document numbers were classified");
        } catch (RuntimeException | IOException e) {
            System.out.println("Exception is found " + e);
        }
    }
}