//Praca domowa opiera się na modyfikacji zadań z dnia poprzedniego, poprzednie rozwiązania nie powinny być modyfikowane, zawartość klas możesz skopiować.
//
//Stwórz klasę Person, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//id - atrybut ten powinien trzymać numer identyfikacyjny,
//firstName - atrybut określający imię autora,
//lastName - atrybut określający nazwisko autora,
//Zdefiniuj odpowiednie dziedziczenie między klasą Author a klasą Person.
//Zdefiniuj odpowiednie dziedziczenie między klasą User a klasą Person.
//Usuń nadmiarowe parametry oraz metody.
package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
