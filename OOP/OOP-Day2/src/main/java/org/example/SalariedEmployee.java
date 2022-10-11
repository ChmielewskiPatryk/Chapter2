//Stwórz klasę SalariedEmployee reprezentującą pracownika, z którym pracodawca ma umowę miesięczną. Klasa powinna:
//
//dziedziczyć po klasie Employee,
//mieć dodatkową metodę calculatePayment(), która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc (dla uproszczenia możemy założyć, że w każdym miesiącu jest 190 godzin pracujących – użyj final static).

package org.example;

public class SalariedEmployee extends Employee{
    final static int hours = 190;

    public SalariedEmployee(Employee employee){
        super(employee.id, employee.firstName, employee.firstName, employee.wage);
    }
    public double calculatePayment(){
        final  double PAYMENT = hours*this.wage;
        return PAYMENT;
    }
}
