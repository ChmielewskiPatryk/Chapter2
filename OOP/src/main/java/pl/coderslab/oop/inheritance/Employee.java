import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

class ZadEmplyee {
    public static void main(String[] args) {
        Employee em = new Employee(23, "Kacper", "Chmielewski", 2000);
        System.out.println("Please enter a raise for the worker in percent");
        int percent = em.number();
        System.out.println(em.raiseWage(percent));
    }
}

public class Employee {
    public int id;
    public String firsName;
    public String lastName;
    public int wage;
    final static int hours = 190;

    public Employee(int id, String firsName, String lastName, int wage) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public int raiseWage(int percent) {
        int raise = wage + ((wage * percent) / 100);
        return raise;
    }

   final public int number() {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        while (!isNumberGreaterEqualZero(n)) {
            System.out.println("Incorrect argument passed. Please give number greater or equal 0");
            n = scan.nextLine();
        }
        return Integer.parseInt(n);
    }

    public static boolean isNumberGreaterEqualZero(String input) {
        if (NumberUtils.isParsable(input)) {

            return Integer.parseInt(input) >= 0;
        }
        return false;
    }

}
