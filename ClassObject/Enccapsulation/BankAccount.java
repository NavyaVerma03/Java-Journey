// // Question: Create a BankAccount class using encapsulation with private variables, getter and setter methods, and implement deposit() and withdraw() methods to display the updated balance.
package ClassObject.Enccapsulation;

import java.util.Scanner;

class Account{
    private int accNo;
    private String holName;
    private double balance;

    public void setAccNo(int accNo){
        this.accNo = accNo;
    }

    public void setHolName(String holName){
        this.holName = holName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getAccNo(){
        return accNo;
    }

    public String getHolName(){
        return holName;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double deposit){
        balance += deposit;
    }
    public void withdraw(double withdraw){
       if(balance >= withdraw){
           balance -= withdraw;
       } else{
           System.out.println("Insufficient Balance");
       }
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a  = new Account();
        System.out.println("Enter Account No:");
        a.setAccNo(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Holder Name:");
        a.setHolName(sc.nextLine());
        sc.nextLine();

        System.out.print("Enter Balance:");
        a.setBalance(sc.nextDouble());

        System.out.print("Enter Deposit Amount:");
        double deposit = sc.nextDouble();
        a.deposit(deposit);

        System.out.print("Enter Withdraw Amount:");
        double withdraw = sc.nextDouble();
        a.withdraw(withdraw);

        System.out.println("\nAccount Details");
        System.out.println("Account No: " + a.getAccNo());
        System.out.println("Holder Name: " + a.getHolName());
        System.out.println("Avaible Balance: " + a.getBalance());



    }
}
