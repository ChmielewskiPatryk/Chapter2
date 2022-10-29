import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

class ZadAdvancedCalculator {
    public double pi = 3.14159265;

    public static void main(String[] args) {
        AdvancedCalculator cals = new AdvancedCalculator();
//        System.out.println(cals.divide(2,2));
//        System.out.println(cals.pow(2,3));
        String result = Double.toString(cals.pow(2.0, 3.0));
        String result2 = Double.toString(cals.pow(3.0, 3.0));
        String result3 = Double.toString(cals.pow(4.0, 3.0));
        System.out.println(Arrays.toString(cals.operations(result3)));
    }
}

public class AdvancedCalculator extends Calculator {
    public String[] operations(String result) {
        this.cal = Arrays.copyOf(this.cal, this.cal.length + 1);
        this.cal[this.cal.length - 1] = result;
        return this.cal;
    }

    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        operations(num1 + "^" + num2 + " " + "equals " + result);
        return result;
    }

    public double root(double num1, double num2) {
        double result = Math.round(Math.pow(num1, (1 / num2)));
        operations(num2 + " root of " + num1 + " equals " + result
        );
        return result;
    }

}
