/**
 * Observer.java
 *
 * Este arquivo demonstra o uso do padrão de design Observer.
 * O padrão Observer define uma dependência um-para-muitos entre objetos para que, quando um objeto
 * muda de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.
 *
 * Usar o padrão Observer para notificar os clientes sobre transações financeiras melhora a reatividade
 * e a modularidade do código, permitindo que novos observadores sejam adicionados facilmente.
 *
 * Comentários em cada linha são fornecidos para facilitar a compreensão dos desenvolvedores iniciantes.
 */

package com.exemplo.designpatterns;

import java.util.ArrayList;
import java.util.List;

// Interface que define o método de atualização para os observadores
interface Observer {
    void update(String message);
}

// Classe que representa um cliente que será notificado sobre transações
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Cliente " + name + ": " + message);
    }
}

// Interface que define os métodos para adicionar, remover e notificar
// observadores
interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}

// Classe que implementa a lógica para gerenciar e notificar os observadores
class AccountSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Método que simula a realização de uma transação e notifica os observadores
    public void performTransaction(String transaction) {
        System.out.println("Transação realizada: " + transaction);
        notifyObservers("Transação: " + transaction);
    }
}
