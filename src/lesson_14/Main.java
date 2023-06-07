package lesson_14;

import lesson_9.B;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //File file = new File("D:\\newFileFolder.txt");
        // String text = "Hello from group 67! Привет привет.";

        //Сохраняем байты в файл
        //  FileOutputStream outputStream = new FileOutputStream(file);
        //  outputStream.write(text.getBytes());
        //  outputStream.close();


        //выкачивание из файла
        //  int i;
        //  FileInputStream fileInputStream = new FileInputStream(file);
        //  while ((i = fileInputStream.read()) != -1) {
        //      System.out.print((char) i);
        //  }
        //  fileInputStream.close();

        //  FileReader fr = new FileReader(file);
        //  int i;
        //  while ((i = fr.read()) != -1) {
        //      System.out.print((char) i);
        //  }
        //  fr.close();

        //   try (FileWriter fw = new FileWriter(file, true)) { //если флаг true до Дописываем информацию(не заменяем)
        //       fw.write("Hello world!");
        //       fw.flush();
        //       fw.write("We are the best group!");
        //   } catch (IOException e) {
        //       e.printStackTrace();
        //   }

        //   Используя FileOutputStream и FileInputStream записать в файл tms.txt строку,
        //   введенную пользователем с консоли. Считать строку из файла tms.txt и вывести в
        //   консоль, заменив все пробелы на знак нижнего подчеркивания.

        //  File file = new File("D:\\tms.txt");

        //  Scanner scanner = new Scanner(System.in);
        //  String line = scanner.nextLine();

        //  FileWriter fileWriter = new FileWriter(file);
        //  fileWriter.write(line);
        //  fileWriter.close();

        //  //вычитываем
        //  FileReader fileReader = new FileReader(file);
        //  StringBuilder newLine = new StringBuilder();
        //  int i;

        //  while ((i = fileReader.read()) != -1) {
        //      newLine.append((char) i);
        //  }
        //  fileReader.close();

        //  //заменяем пробелы на _
        //  System.out.println(newLine.toString().replace(" ", "_"));
        Weekend weekend = new Weekend();
        weekend.name = "Friday";

     //  ObjectOutputStream outputStream =
     //          new ObjectOutputStream(new FileOutputStream("D:\\week.txt"));
     //  outputStream.writeObject(weekend);
     //  outputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("D:\\week.txt"));
        Weekend weekendRestored = (Weekend)objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(weekendRestored.name);
    }
}