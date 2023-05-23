package pl.coderslab.oop.inheritance;

import static pl.coderslab.oop.inheritance.AdvanceCalculator.printGlobalOperations;

public class Main {
    public static void main(String[] args) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();

        System.out.println(advanceCalculator.add(2, 5));


        System.out.println(advanceCalculator.power(3, 3));

        System.out.println(advanceCalculator.sqrt(16, 2));
        advanceCalculator.printOperations();

        printGlobalOperations();

        printGlobalOperations(1);
        printGlobalOperations("2");
        Shape shape1 = new Shape(0, 0, "cz");
        Shape shape2 = new Shape(3, 4, "cz");
        shape1.getDescription();
        shape2.getDescription();
        System.out.println(shape1.getDistance(shape2));
        Circle circle = new Circle(5, 5, "nb", 5);
        System.out.println(circle.getArea());
        System.out.println(circle.getDescription());
        System.out.println(circle.getCircuit());
        System.out.println(circle.getDistance(shape2));

        Employee employee = new Employee(1, "Pan", "Sam", 12);
        System.out.println(employee);
        employee.raiseWage(7);
        System.out.println(employee);

        HourlyEmployee employee1 = new HourlyEmployee(2, "Pan2", "Sam2", 13);
        System.out.println(employee1.calculatePayment(15));
        SalariedEmployee employee2 = new SalariedEmployee(2, "Pan3", "Sam", 15);

        System.out.println(employee2.calculatePayment());

        Calculator advanceCalc = new Calculator();
        int i = Integer.MAX_VALUE;
        short sh = (short) i;
        System.out.println("sh = " + sh);
        System.out.println(1 + 2 + "");
        System.out.println("" + 1 + 2);
    }


}
