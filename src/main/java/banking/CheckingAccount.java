package banking;

public class CheckingAccount implements Asset, BankAccount {
    private double balance = 0;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return amount;
        }
        else {
            double withdrawAmount = this.balance;
            this.balance = 0;
            return withdrawAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
