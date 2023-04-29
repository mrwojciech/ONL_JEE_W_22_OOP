package pl.coderslab.oop.methods;

public class Person {
    private String name = "Tom";
    private String surname = "Kovalsky";
    private int age = 22;
    private char gender = 'M';

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void increaseAge() {
        this.age = age + 1;
    }
}
