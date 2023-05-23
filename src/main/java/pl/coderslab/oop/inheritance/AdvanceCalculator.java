package pl.coderslab.oop.inheritance;

public class AdvanceCalculator extends Calculator {

    public static final double PI = 3.13149265;
    public static String[] allOperations;

    public AdvanceCalculator() {
        allOperations = new String[0];
    }

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
        //metoda statyczna nie moze zapisywac/ wywolywac w metodzie nie statycznej
    }

    static void printGlobalOperations() {
        System.out.println("Printing global operations");
        for (String operation : allOperations) {
            System.out.println(operation);
        }
    }

    static void printGlobalOperations(int length) {
        System.out.println("Printing global operations int:" + length);
        for (int i = 0; i < length; i++) {
            String operation = allOperations[i];
            System.out.println(operation);
        }
    }

    static void printGlobalOperations(String length) {
        System.out.println("Printing global operations String:" + length);
        for (int i = 0; i < Integer.parseInt(length); i++) {
            String operation = allOperations[i];
            System.out.println(operation);
        }
    }
}