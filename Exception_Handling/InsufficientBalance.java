// Create a custom exception named InsufficientBalanceException and throw it when the withdrawal amount is greater than the account balance, then handle it using try-catch.
package Exception_Handling;
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class InsufficientBalance {

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        int balance = 5000;
        int amount = 7000;

        try {
            withdraw(balance, amount);
        }

        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}