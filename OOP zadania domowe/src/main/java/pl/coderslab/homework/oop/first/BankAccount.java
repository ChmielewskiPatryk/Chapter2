import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

class ZadBank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2);
        System.out.println(bankAccount.getCash());
        bankAccount.depositCash();
        System.out.println(bankAccount.getCash());
        bankAccount.withdrawCash();
//        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.printInfo());
    }
}

    public  class BankAccount {
        private int number;
        private double cash;

        public BankAccount(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public String getCash() {
            String cash = Double.toString(this.cash);
            return "Your account balance is: " + cash;
        }

        public void depositCash() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please give amount of money you want to deposit");
            String n = scanner.nextLine();
            while (!isNumberGreaterEqualZero(n)) {
                System.out.println("Incorrect argument passed. Please give number greater or equal 0");
                n = scanner.nextLine();
            }
            this.cash = this.cash + Double.parseDouble(n);
        }

        public double withdrawCash() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please give amount of money you want to withdraw");
            String x = scan.nextLine();
            while (!isNumberGreaterEqualZero(x)) {
                System.out.println("Incorrect argument passed. Please give number greater or equal 0");
                x = scan.nextLine();
            }
            this.cash = this.cash - Double.parseDouble(x);
            return this.cash;
        }

        public boolean isNumberGreaterEqualZero(String input) {
            if (NumberUtils.isParsable(input)) {
                return Double.parseDouble(input) >= 0;
            }
            return false;
        }
        public String printInfo() {
            String number = Integer.toString(getNumber());
            return "Your count number is: " + number + "\n" + getCash();
        }
    }


