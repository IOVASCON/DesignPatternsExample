package com.exemplo.designpatterns;

interface InterestStrategy {
    double calculateInterest(double balance);
}

class RegularInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.03;
    }
}

class HighInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }
}

class AccountContext {
    private InterestStrategy strategy;

    public void setInterestStrategy(InterestStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateInterest(double balance) {
        return strategy.calculateInterest(balance);
    }
}
