package lesson_15;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MainLinkedList {
    public static void main(String[] args) {
        //Двусвязный список
        // Хранит элементы в порядке добавления
        // И дубликаты
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.remove(1);
        list.addFirst("Hello");
        list.addLast("HelloLast");

        //А также есть метод peek(), который идентичен getFirst(), но не вызовет ошибку, если объект будет несуществующим, а просто вернёт null
        list.peek();

        //Для удаления отдельного элемента кроме метода remove() можно вызвать методы poll()
        list.poll();

        System.out.println(list.peek());
    }
}
