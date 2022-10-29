//W pliku Main02.java, w metodzie main, utwórz obiekt klasy AccessModifier o nazwie testAttribute,
//a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.

package org.example;

public class AtrybutyZad3 {
    public static void main(String[] args){
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.surName);
        System.out.println(person.age);
        System.out.println(person.gender);

    }
}

 class Person{
    public String name = "Adam";
    public String surName = "Adamski";
    public int age = 18;
    public char gender = 'M';

}