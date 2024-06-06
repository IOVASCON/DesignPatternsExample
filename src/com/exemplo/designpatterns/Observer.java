package com.exemplo.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

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

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}

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

    public void performTransaction(String transaction) {
        System.out.println("Transação realizada: " + transaction);
        notifyObservers("Transação: " + transaction);
    }
}
