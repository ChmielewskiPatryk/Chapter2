//Stwórz klasę HourlyEmployee, reprezentującą pracownika, któremu pracodawca płaci za godziny. Klasa ma spełniać następujące wymogi:
//
//ma dziedziczyć po klasie Employee,
//posiadać dodatkową metodę calculatePayment(hours), która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin.
package org.example;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(Employee employee){
        super(employee.id, employee.firstName, employee.lastName, employee.wage);
    }
    public double calculatePayment(int hours){
        return hours*this.wage;
    }
}
