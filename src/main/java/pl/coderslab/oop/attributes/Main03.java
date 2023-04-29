package pl.coderslab.oop.attributes;

public class Main03 {

    final String text = "wojtek";

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.name);
        System.out.println(person.surname);
    }
}
