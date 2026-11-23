import java.util.ArrayList;
import java.util.List;


public class BankingMain {

    public static void main(String[] args) {

        SavingsAccount hande = new SavingsAccount(200);
        CheckingAccount davesAccount = new CheckingAccount(0);

        // Person p = new Developer();

//        System.out.println("hande's balance: " + hande.getValue());
        System.out.println("dave's balance: " + davesAccount.getValue());

        transfer(100, hande, davesAccount);

//        System.out.println("hande's balance: " + hande.getValue());
//        System.out.println("dave's balance: " + dave.getValue());
    }

    public static void transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {
        double amountWithdrawn = fromAccount.withdraw(amount);


        toAccount.deposit(amountWithdrawn);
    }
}
