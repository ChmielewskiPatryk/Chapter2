//Stwórz klasę Employee, która posiada:
//
//publiczne atrybuty:
//id – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
//firstName – atrybut określający imię pracownika,
//lastName – atrybut określający nazwisko pracownika,
//wage – atrybut określający stawkę godzinową pracownika,
//konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
//metodę raiseWage(percent), której rolą będzie zwiększenie wartości atrybutu wage o podany procent.
//Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.
package org.example;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int _id, String _firstName, String _lastName, double _wage) {
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.wage = _wage;
    }

    public void raiseWage(int percent) {
        this.wage = wage * (100 + percent) / 100;
    }

}
