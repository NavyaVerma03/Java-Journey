// Create a BankAccount class with deposit(), withdraw(), and displayBalance() methods, then perform banking operations using an object.
package ClassObject;

class BankAccount {
    int acNum;
    String acHolNum;
    double bal;

    // Constructor
    BankAccount(int acNum, String acHolNum, double bal) {
        this.acNum = acNum;
        this.acHolNum = acHolNum;
        this.bal = bal;
    }

    // Deposite Method
    void deposit(double amount) {
        bal = bal + amount;
        System.out.println("Deposited Amount: $" + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if(amount<= bal){
            bal = bal - amount;
            System.out.println("Withdraw Amount: $" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("\nAccount Number: " + acNum);
        System.out.println("Account Holder: " + acHolNum);
        System.out.println("Current Balance: $" + bal);
    }


}

public class Bank {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345,"Navya Verma",10000);
        ba.deposit(50000);
        ba.withdraw(30000);
        ba.displayBalance();

    }
}
