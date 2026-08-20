interface Password {

    int password = 1234;

    boolean withdrawCash(int enteredPassword, int amount);

    boolean moneyTransfer(int enteredPassword, int amount);

    int getBalance();
}


abstract class ATM implements Password {

    private int balance = 1000;

    ATM() {
        System.out.println("ATM Created");
    }

    @Override
    public boolean withdrawCash(int enteredPassword, int amount) {

        if (enteredPassword != password) {
            System.out.println("Wrong Password");
            return false;
        }

        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient Balance");
            return false;
        }

        balance = balance - amount;

        System.out.println("Withdrawn Amount: " + amount);
        return true;
    }

    @Override
    public boolean moneyTransfer(int enteredPassword, int amount) {

        if (enteredPassword != password) {
            System.out.println("Wrong Password");
            return false;
        }

        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient Balance");
            return false;
        }

        balance = balance - amount;

        System.out.println("Transferred Amount: " + amount);
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public abstract void display();
}


class Test extends ATM {

    @Override
    public void display() {

        withdrawCash(password, 100);

        moneyTransfer(password, 200);

        System.out.println("Remaining Balance: " + getBalance());
    }
}


public class ATM {

    public static void main(String[] args) {

        Test t = new Test();

        t.display();
    }
}