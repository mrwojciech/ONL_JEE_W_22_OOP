package pl.coderslab.oop.inheritance;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    double wage;


    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    void raiseWage(double percent) {
        if (wage > 0) {
            wage = wage + wage * percent/100;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + wage +
                '}';
    }
}
