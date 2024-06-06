/**
 * AccountFactory.java
 *
 * Este arquivo demonstra o uso do padrão de design Factory.
 * O padrão Factory define uma interface para criar objetos, mas permite que as subclasses
 * decidam qual classe instanciar.
 *
 * Usar o padrão Factory para criar diferentes tipos de contas financeiras (Poupança e Corrente)
 * melhora a flexibilidade e a escalabilidade do código, facilitando a adição de novos tipos de contas
 * no futuro sem modificar a lógica existente.
 *
 * Comentários em cada linha são fornecidos para facilitar a compreensão dos desenvolvedores iniciantes.
 */

package com.exemplo.designpatterns;

// Classe que implementa o padrão Factory para criar diferentes tipos de contas
class AccountFactory {
    public static Account getAccount(String accountType) {
        if ("SAVINGS".equalsIgnoreCase(accountType)) {
            return new SavingsAccount();
        } else if ("CHECKING".equalsIgnoreCase(accountType)) {
            return new CheckingAccount();
        }
        return null;
    }
}
