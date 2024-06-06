package com.exemplo.designpatterns;

public class FinancialManagementSystem {
    public static void main(String[] args) {
        // Singleton Pattern
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Factory Pattern
        Account savings = AccountFactory.getAccount("SAVINGS");
        savings.accountType();

        Account checking = AccountFactory.getAccount("CHECKING");
        checking.accountType();

        // Observer Pattern
        AccountSubject account = new AccountSubject();
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        account.addObserver(client1);
        account.addObserver(client2);

        account.performTransaction("Depósito de $1000");

        // Strategy Pattern
        AccountContext accountContext = new AccountContext();

        accountContext.setInterestStrategy(new RegularInterestStrategy());
        System.out.println("Juros Regular: " + accountContext.calculateInterest(1000));

        accountContext.setInterestStrategy(new HighInterestStrategy());
        System.out.println("Juros Alto: " + accountContext.calculateInterest(1000));

        dbConnection.disconnect();
    }
}
