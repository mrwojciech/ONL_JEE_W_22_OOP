package pl.coderslab.oop.advanced;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Calculator {
    private static String[] operations;
    DecimalFormat df = new DecimalFormat("#.##");

    public Calculator() {
        operations = new String[0];
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public double substract(double num1, double num2) {
        double result = num1 - num2;
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " * " + num2 + " = " + result);
        return result;

    }

    public double divide(double num1, double num2) {
        double result = num1 / num2;
        result = Double.parseDouble(df.format(result));
        addOperation(num1 + " / " + num2 + " = " + result);
        return result;
    }

    public void clearOperations() {
        operations = Arrays.copyOf(operations, 0);
    }

    public static void printOperations() {
        for (String operation : operations) {
            System.out.println(operation);
        }
    }

    protected static void printOperations(int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.println(i + " : " + operations[i]);
        }
    }

    protected void addOperation(String operation) {
        operations = Arrays.copyOf(operations, operations.length + 1);
        operations[operations.length - 1] = operation;
    }


}
