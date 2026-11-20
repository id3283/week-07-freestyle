public class CryptoAccount implements BankAccount{
    private double value;

    public CryptoAccount(double value) {
        this.value = value;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }
}
