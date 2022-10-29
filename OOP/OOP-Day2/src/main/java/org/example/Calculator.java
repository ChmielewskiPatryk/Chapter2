package org.example;

import java.util.Arrays;

public class Calculator {
    String[] arr;

    public Calculator() {
        arr = new String[0];
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        addOperation("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        addOperation("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    public int substract(int num1, int num2) {
        int result = num1 - num2;
        addOperation("substracted " + num2 + " from " + num1 + " got " + result);
        return result;
    }

    public int divide(int num1, int num2) {
        int result;
        if (num2 != 0) {
            result = num1 / num2;
            addOperation("divided " + num1 + " by " + num2 + " got " + result);
        } else {
            result = 0;
        }
        return result;
    }

    public String[] addOperation(String text) {
        this.arr = Arrays.copyOf(this.arr, this.arr.length + 1);
        this.arr[this.arr.length - 1] = text;
        return this.arr;
    }

    public void printOperations() {
        for (String item : this.arr) {
            System.out.println(item);
        }
    }

    public void clearOperations() {
        this.arr = new String[0];
    }
}
