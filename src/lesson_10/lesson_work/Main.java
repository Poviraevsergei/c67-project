package lesson_10.lesson_work;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();

        Person newPerson = (Person) person.clone();
        newPerson.setName("Valeriy");

        System.out.println(person);
        System.out.println(newPerson);

        System.out.println(person.equals(newPerson));
    }
}
