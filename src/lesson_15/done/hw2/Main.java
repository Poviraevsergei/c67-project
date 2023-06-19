package lesson_15.done.hw2;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(); //list
        myList.add("Hello1");
        myList.add("Hello2");
        myList.add("Hello3");
        myList.add("Hello4");
        System.out.println(myList.getList());
        myList.remove();
        myList.remove();
        myList.remove();
        System.out.println(myList.getList());
    }
}
