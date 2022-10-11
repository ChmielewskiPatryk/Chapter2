//Stwórz klasę AdvancedCalculator, która dziedziczy po klasie Calculator. Klasa powinna implementować następujące metody:
//
//pow(num1, num2) – metoda ma zwracać num1 do potęgi num2. Dodatkowo w tablicy operacji ma zapamiętać napis: "num1^num2 equals result".
//root(num1, num2) – metoda ma wyliczyć pierwiastek num2 stopni

//Do klasy AdvancedCalculator dopisz:
//
//stałą PI, która będzie miała przypisaną wartość 3.14159265,
//statyczną metodę computeCircleArea(r), która będzie zwracała pole koła. Ta metoda nie będzie dopisywać obliczeń do tablicy (napisz w komentarzu, dlaczego nie może tego robić),
//statyczną tablicę, która będzie przechowywała historię operacji wykonanych na wszystkich kalkulatorach,
//statyczną metodę printGlobalOperations(), która będzie wyświetlała wszystkie operacje ze wszystkich obiektów klasy AdvancedCalculator.
package org.example;

import java.util.Arrays;

public class AdvancedCalculator extends Calculator{
    final static double PI = 3.14159265;
    static String[] globalArr;

    public double pow(double num1, double num2) {
        double result = Math.pow(num1,num2);
        addOperation( num1 + " ^ " + num2 + " equals " + result);
        return result;
    }
    public double root(double num1, double num2) {
        double result = Math.round(Math.pow(num1,(1/num2)));
        addOperation( num2 + " root of " + num1 + " equals " + result);
        return result;
    }
    public static double computeCircleArea(double r){
        // metoda nie może dodawać do tablicy bo jest static, więc mozemy z niej korzystać bez utworzenia obiektu
        // i przez to nie bedzie utworzona tablica
        return 2*PI*r;
    }

    @Override
    public String[] addOperation(String text) {
        return super.addOperation(text);
        globalArr = Arrays.copyOf(globalArr, globalArr.length + 1);
        globalArr[globalArr.length - 1] = text;
    }

    public static void printGlobalOperations(){
        for(String item : globalArr){
            System.out.println(item);
        }
    };

}
