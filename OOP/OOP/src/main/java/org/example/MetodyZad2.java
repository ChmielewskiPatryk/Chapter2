//Utwórz klasę Person, dodaj w niej atrybuty:
//
//name,
//surname,
//age,
//gender.
//Wszystkie atrybuty mają być prywatne i mają mieć ustawione wartości domyślne.
//
//Dodaj metody:
//
//setName,
//setSurname,
//setAge,
//setGender,
//które ustawią atrybuty klasy zgodnie z nazwą, na którą wskazują. Np. setName – ustawia atrybut name.
//
//Dodaj metody:
//
//getName,
//getSurname,
//getAge,
//getGender,
//które zwrócą wartość prywatnego atrybutu Np. getName – zwraca wartość atrybutu name.
//
//W pliku Main02.java umieść w metodzie main kod, który utworzy obiekt klasy Person o nazwie person, a następnie ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.

// ZAD.3
//Do klasy Person dopisz metodę getFullName, która zwróci imię i nazwisko połączone znakiem spacji.

//ZAD 4
//W klasie Person napisz metodę increaseAge, która inkrementuje zmienną age o 1.

package org.example;

public class MetodyZad2 {

    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setName("Adam");
        person.setSurName("Adamski");
        person.setAge(18);
        person.setGender('M');
        person.getFullName();
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        person.increaseAge();
        System.out.println(person.getAge());

    }
}

class Person1 {
    private String name;
    private String surName;
    private int age;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return name + " " + surName;
    }

    public void increaseAge() {
        this.age += 1;
    }
}
