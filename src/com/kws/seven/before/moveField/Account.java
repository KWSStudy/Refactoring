package com.kws.seven.before.moveField;

public class Account {
    private AccountType _type;
    private double _interestRate;

    public Account(String owner) {
        _type = new AccountType(owner);

        if (owner.equals("홍길동")) {
            _interestRate = 0.3;
        } else {
            _interestRate = 0.45;
        }
    }

    public double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}
