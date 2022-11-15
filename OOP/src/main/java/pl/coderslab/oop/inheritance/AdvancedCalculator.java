import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

class ZadAdvancedCalculator {

    public static void main(String[] args) {
        AdvancedCalculator cals = new AdvancedCalculator();
        cals.add(1, 1);
        cals.pow(1, 1);
        cals.add(2,2);
        cals.pow(2, 2);
        cals.add(3,3);
        cals.pow(3, 3);
        cals.printGlobalOperations("1");

    }
}

public class AdvancedCalculator extends Calculator {
    public static double pi = 3.14159265;
    public static String[] allAdvancedOps;

    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        addOperationToAdvancedCalculator(num1 + "^" + num2 + " " + "equals " + result);
        return result;
    }

    public double root(double num1, double num2) {
        double result = Math.round(Math.pow(num1, (1 / num2)));
        addOperationToAdvancedCalculator(num2 + " root of " + num1 + " equals " + result);
        return result;
    }

    public static double computeCircleArea(double r) {
        return pi * Math.pow(r, 2);
    }

    public void addOperationToAdvancedCalculator(String text) {
        allAdvancedOps = super.operation(text);
    }

    public static void printGlobalOperations() {
        for (String allOp : allAdvancedOps) {
            System.out.println(allOp);
        }
    }
    public static void printGlobalOperations(int lenght) {
     if(allAdvancedOps.length <= lenght) {
            for (String allOp : allAdvancedOps) {
                System.out.println(allOp);
            }
        }else {
         for (int x = 0; x < lenght; x++){
             System.out.println(allAdvancedOps[x]);
         }
     }
    }
    public static void printGlobalOperations(String lenght) {
        int number = Integer.parseInt(lenght);
        if(allAdvancedOps.length <= number) {
            for (String allOp : allAdvancedOps) {
                System.out.println(allOp);
            }
        }else {
            for (int x = 0; x < number; x++){
                System.out.println(allAdvancedOps[x]);
            }
        }
    }
}
