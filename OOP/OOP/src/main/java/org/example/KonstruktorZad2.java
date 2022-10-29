//Stwórz klasę Calculator. Konstruktor ma nie przyjmować żadnych danych. Każdy nowo stworzony obiekt powinien mieć tablicę String, w której będzie trzymać historię ostatnich operacji (stwórz ją w konstruktorze – z początkowym rozmiarem 0). Następnie dodaj do klasy następujące metody:
//
//add(num1, num2) – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added num1 to num2 got result".
//multiply(num1, num2) – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied num1 with num2 got result".
//subtract(num1, num2) – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted num2 from num1 got result".
//divide(num1, num2) – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided num1 by num2 got result". Pamiętaj, że nie można dzielić przez zero.
//printOperations() – metoda ma wypisać wszystkie zapamiętane operacje.
//clearOperations() – metoda ma wyczyścić wszystkie zapamiętane operacje.
//Możesz dopisać metodę pomocniczą, która będzie zwiększała rozmiar tablicy przez kopiowanie. Następnie będzie dodawała wpis na liście operacji.
//
//Pamiętaj o używaniu this w odpowiednich miejscach. Stwórz kilka kalkulatorów i przetestuj ich działanie.
package org.example;

import java.util.Arrays;

public class KonstruktorZad2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printOperations();
        calc.add(5, 8);
        calc.multiply(5, 7);
        calc.printOperations();
        calc.divide(6, 2);
        calc.substract(8, 3);
        calc.printOperations();
        calc.clearOperations();
        System.out.println("Cleared operations");
        calc.printOperations();
    }
}

class Calculator {
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

    private String[] addOperation(String text) {
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