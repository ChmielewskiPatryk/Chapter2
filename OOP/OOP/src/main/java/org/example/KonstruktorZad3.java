//Utwórz klasę Person, dodaj w niej atrybuty:
//
//name
//surname
//age
//gender
//Wszystkie atrybuty mają być prywatne.
//
//Utwórz konstruktor, który przyjmie i ustawi parametry name, surname.
//Utwórz konstruktor, który przyjmie i ustawi parametry name, age.
//Utwórz konstruktor, który przyjmie i ustawi parametry name, surname, age, gender.
package org.example;

public class KonstruktorZad3 {
    public static void main(String[] args) {

    }
}

class Person2 {
    public String name;
    public String surName;
    public int age;
    public char gender;

    public Person2(String _name, String _surName) {
        this.name = _name;
        this.surName = _surName;
    }

    public Person2(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public Person2(String _name, String _surName, int _age, char _gender) {
        this.name = _name;
        this.surName = _surName;
        this.age = _age;
        this.gender = _gender;
    }
}
