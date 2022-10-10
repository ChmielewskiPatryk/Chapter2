//Utwórz klasę AccessModifier dodaj w niej atrybuty:
//
//atrybut o nazwie publicAttribute z modyfikatorem public,
//atrybut o nazwie privateAttribute z modyfikatorem private,
//atrybut o nazwie protectedAttribute z modyfikatorem protected.
//W pliku Main01.java umieść w metodzie main kod, który:
//
//Utworzy obiekt klasy AccessModifier i przypisze go do zmiennej testAttribute.
//Sprawdź które z atrybutów klasy AccessModifier są dostępne.

//Zadanie 2
//W pliku Main02.java, w metodzie main, utwórz obiekt klasy AccessModifier o nazwie testAttribute,
//a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.
package org.example;

public class AtrybutyZad1 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);
    }
}

class AccessModifier {
    public String publicAttribute;
    private String privateAttribute;
    protected String protectedAttribute;
}