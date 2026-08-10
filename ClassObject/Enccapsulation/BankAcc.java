// Create a BankAccount class with private accountNumber and balance variables, and use getter and setter methods to manage account details.
package ClassObject.Enccapsulation;

public class BankAcc {
    public static void main(String[] args) {
        Coustumer c = new Coustumer();
        c.setAccNo(101);
        c.setBal(5000);

        System.out.println("Account Number: " + c.getAccNo());
        System.out.println("Balance: " + c.getBal());
    }
}

class Coustumer{
    private int accNo;
    private double bal;

     int getAccNo() {
        return accNo;
    }

     void setAccNo(int accNo) {
        this.accNo = accNo;
    }

     double getBal() {
        return bal;
    }

    void setBal(double bal) {
        this.bal = bal;
    }
}