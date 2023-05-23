package pl.coderslab.oop.advanced;

public class AdvanceCalculator extends Calculator {

    public static final double PI = 3.13149265;

    public double power(double num1, double num2) {
        double result = Math.pow(num1, num2);
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " ^ " + num2 + " = " + result);
        return result;
    }

    public double sqrt(double num1, double num2) {
        double result = Math.pow(num1, 1 / num2);
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " sqrt " + num2 + " = " + result);
        return result;
    }

    public static double computeCircleArea(double r) {
        return PI * Math.pow(r, 2);
    }

    public void printGlobalOperations(int lenght) {
        Calculator.printOperations(lenght);
    }

    public void printGlobalOperations() {
        Calculator.printOperations();
    }

}
