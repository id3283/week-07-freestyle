package banking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Asset myGold = new Gold(10);
        Asset checking = new CheckingAccount(100);

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(myGold);
        assets.add(checking);

        double netWorth = 0;

        for (Asset a: assets) {
            netWorth += a.getValue();
        }

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add( new CryptoAccount(200));
        bankAccounts.add( new CheckingAccount(5));

        for (BankAccount bankAccount: bankAccounts) {
            bankAccount.deposit(5000);
//            System.out.println("account's value: " + bankAccount);
        }


        System.out.println("My net worth in dollars is: " + netWorth);
    }
}
