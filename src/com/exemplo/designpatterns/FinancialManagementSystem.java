/**
 * FinancialManagementSystem.java
 *
 * Este arquivo demonstra a integração de vários padrões de design em um sistema de gerenciamento financeiro.
 * Os padrões utilizados incluem Singleton, Factory, Observer e Strategy.
 *
 * Usar esses padrões melhora a modularidade, flexibilidade e reutilização do código, facilitando a manutenção
 * e a expansão do sistema.
 *
 * Comentários em cada linha são fornecidos para facilitar a compreensão dos desenvolvedores iniciantes.
 */

package com.exemplo.designpatterns;

public class FinancialManagementSystem {
    public static void main(String[] args) {
        // Singleton Pattern
        // Obtemos a instância única da conexão com o banco de dados e conectamos
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Factory Pattern
        // Criamos diferentes tipos de contas usando o padrão Factory
        Account savings = AccountFactory.getAccount("SAVINGS");
        savings.accountType();

        Account checking = AccountFactory.getAccount("CHECKING");
        checking.accountType();

        // Observer Pattern
        // Criamos o sujeito que gerencia as contas e adicionamos observadores
        // (clientes)
        AccountSubject account = new AccountSubject();
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");

        account.addObserver(client1);
        account.addObserver(client2);

        // Realizamos uma transação e notificamos os observadores
        account.performTransaction("Depósito de $1000");

        // Strategy Pattern
        // Utilizamos diferentes estratégias de cálculo de juros
        AccountContext accountContext = new AccountContext();

        accountContext.setInterestStrategy(new RegularInterestStrategy());
        System.out.println("Juros Regular: " + accountContext.calculateInterest(1000));

        accountContext.setInterestStrategy(new HighInterestStrategy());
        System.out.println("Juros Alto: " + accountContext.calculateInterest(1000));

        // Desconectamos do banco de dados
        dbConnection.disconnect();
    }
}
