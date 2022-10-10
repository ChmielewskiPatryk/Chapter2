//Stwórz klasę BankAccount, która ma spełniać następujące wymogi:
//
//Mieć prywatne atrybuty:
//number - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć że numerem konta może być dowolna liczba całkowita),
//cash - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa. Atrybut cash powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
//Posiadać konstruktor przyjmujący tylko numer konta.
//Posiadać gettery do atrybutów number i cash, ale NIE posiadać do nich setterów (nie chcemy żeby raz stworzone konto mogło zmienić swój numer, a do atrybutu cash dodamy specjalne funkcje modyfikujące jego wartość).
//Posiadać metodę void depositCash(amount) której rolą będzie zwiększenie wartości atrybutu cash o podaną wartość. Pamiętaj o sprawdzeniu czy podana wartość jest:
//Większa od 0
//Posiadać metodę double withdrawCash(amount) której rolą będzie zmniejszenie wartości atrybutu cash o podaną wartość. Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy że ilość pieniędzy na koncie nie może zejść poniżej 0, np. jeżeli z konta na którym jest 300zł próbujemy wypłacić 500zł to metoda zwróci nam tylko 300zł. Pamiętaj o sprawdzeniu czy podana wartość jest:
//Większa od 0
//Posiadać metodę String printInfo() nie przyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie.
package org.example;

public class Zad1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1);
        System.out.println("Acc info:");
        System.out.println(bankAccount.printInfo());
        System.out.println("Deposit 500:");
        bankAccount.depositCash(500);
        System.out.println(bankAccount.printInfo());
        System.out.println("try deposit -700:");
        bankAccount.depositCash(-700);
        System.out.println(bankAccount.printInfo());
        System.out.println("withdraw 200:");
        bankAccount.withdrawCash(200);
        System.out.println(bankAccount.printInfo());
        System.out.println("withdraw 400:");
        System.out.println(bankAccount.withdrawCash(400));
        System.out.println(bankAccount.printInfo());
    }
}

class BankAccount {
    private int number;
    private double cash;

    public BankAccount(int _number) {
        this.cash = 0;
        this.number = _number;
    }

    public double getCash() {
        return cash;
    }

    public int getNumber() {
        return number;
    }

    public void depositCash(double _amount) {
        if (_amount > 0) {
            this.cash += _amount;
        }
    }

    public double withdrawCash(double _amount) {
        double withdrawn = 0;
        if (_amount > 0) {
            if (this.cash > _amount) {
                this.cash -= _amount;
                withdrawn = _amount;
            } else {
                this.cash = 0;
                withdrawn = this.cash;
            }
        }
        return withdrawn;
    }

    public String printInfo() {
        return "Account number: " + number + " Balance: " + cash;
    }
}