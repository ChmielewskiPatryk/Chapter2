class ZadHourlyEmployee{
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(3, "Tomasz", "Kaczmarek",20);
        System.out.println("Please enter a numbers of hours");
        int hours = hourlyEmployee.number();
        System.out.println(hourlyEmployee.calculatePayment(hours));
    }
}

public class HourlyEmployee extends Employee {
    public int hours;
    public HourlyEmployee(int id, String firsName, String lastName, int wage) {
        super(id, firsName, lastName, wage);

    }
    public int calculatePayment(int hours){
        int pay = hours * wage;
        return pay;
    }
}
