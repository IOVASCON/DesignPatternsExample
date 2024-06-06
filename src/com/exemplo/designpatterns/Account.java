package com.exemplo.designpatterns;

interface Account {
    void accountType();
}

class SavingsAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Conta Poupança");
    }
}

class CheckingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Conta Corrente");
    }
}
