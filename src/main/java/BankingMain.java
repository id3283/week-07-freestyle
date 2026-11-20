public class BankingMain {

    public static void main(String[] args) {

        CryptoAccount hande = new CryptoAccount(200);
        CheckingAccount dave = new CheckingAccount(0);

//        System.out.println("hande's balance: " + hande.getValue());
//        System.out.println("dave's balance: " + dave.getValue());

        transfer(100, hande, dave);

//        System.out.println("hande's balance: " + hande.getValue());
//        System.out.println("dave's balance: " + dave.getValue());
    }

    public static void transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
        double amountWithdrawn = fromAccount.withdraw(amount);

        toAccount.deposit(amountWithdrawn);
    }
}
