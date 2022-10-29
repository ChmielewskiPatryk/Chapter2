class zadSalariedEmployee{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(4, "Kamil", "Nowakowski", 23);
    }
}
public class SalariedEmployee extends Employee {
    public SalariedEmployee(int id, String firsName, String lastName, int wage) {
        super(id, firsName, lastName, wage);
    }
    public int calculatePayment(){
        int payment = hours * wage;
        return payment;
    }
}
