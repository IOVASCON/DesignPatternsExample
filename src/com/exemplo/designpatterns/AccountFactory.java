package com.exemplo.designpatterns;

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
