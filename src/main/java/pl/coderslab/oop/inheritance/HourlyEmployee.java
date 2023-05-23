package pl.coderslab.oop.inheritance;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    double calculatePayment(double hours) {
        return hours * wage;
    }
}
