package com.kws.seven.after.moveField;

public class AccountType {
    private String _owner;
    private double _interestRate;

    public AccountType(String owner) {
        _owner = owner;
    }

    public double getInterestRate() {
        return _interestRate;
    }

    public void setInterestRate(double interestRate) {
        _interestRate = interestRate;
    }
}
