package pl.coderslab.oop.inheritance;

public class SalariedEmployee extends Employee {

    public final int NORAML_HOURS_NUMBER_190 = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    double calculatePayment() {
        return NORAML_HOURS_NUMBER_190 * wage;
    }
}
