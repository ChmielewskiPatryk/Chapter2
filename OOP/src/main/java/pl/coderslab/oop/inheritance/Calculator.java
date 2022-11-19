import java.security.PublicKey;
import java.util.Arrays;

public class Calculator {
    double num1;
    public double num2;
    public String[] cal;

    public Calculator() {
        this.num1 = num1;
        this.num2 = num2;
        cal = new String[0];
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        operation("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        operation("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    public int substract(int num1, int num2) {
        int result = num1 - num2;
        operation("substracted " + num2 + " from " + num1 + " got " + result);
        return result;
    }

    public int divide(int num1, int num2) {
        int result;
        if (num2 != 0) {
            result = num1 / num2;
            operation("divided " + num1 + " by " + num2 + " got " + result);
        } else {
            result = 0;
        }
        return result;
    }

    protected String[] operation(String text) {
        this.cal = Arrays.copyOf(this.cal, this.cal.length + 1);
        this.cal[this.cal.length - 1] = text;
        return cal;
    }

    public void printOperations() {
        for (String item : cal) {
            System.out.println(item);
        }
    }

    public void clearOperations() {
        this.cal = new String[0];
    }
}
