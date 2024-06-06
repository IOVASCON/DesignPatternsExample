/**
 * InterestStrategy.java
 *
 * Este arquivo demonstra o uso do padrão de design Strategy.
 * O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
 *
 * Usar o padrão Strategy para implementar diferentes estratégias de cálculo de juros melhora a flexibilidade
 * e a reutilização do código, permitindo que novos algoritmos de cálculo de juros sejam adicionados facilmente.
 *
 * Comentários em cada linha são fornecidos para facilitar a compreensão dos desenvolvedores iniciantes.
 */

package com.exemplo.designpatterns;

// Interface que define a estratégia de cálculo de juros
interface InterestStrategy {
    double calculateInterest(double balance);
}

// Classe que implementa a estratégia de cálculo de juros regular
class RegularInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.03;
    }
}

// Classe que implementa a estratégia de cálculo de juros alto
class HighInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }
}

// Contexto que utiliza diferentes estratégias de cálculo de juros
class AccountContext {
    private InterestStrategy strategy;

    // Método para definir a estratégia de cálculo de juros
    public void setInterestStrategy(InterestStrategy strategy) {
        this.strategy = strategy;
    }

    // Método para calcular os juros utilizando a estratégia definida
    public double calculateInterest(double balance) {
        return strategy.calculateInterest(balance);
    }
}
