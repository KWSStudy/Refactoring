package com.kws.seven.after.moveField;

public class Account {
    private AccountType _type;

    public Account(String owner) {
        _type = new AccountType(owner);

        if (owner.equals("홍길동")) {
            setInterestRate(0.3);
        } else {
            setInterestRate(4.5);
        }
    }

    public double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    private void setInterestRate(double arg) {
        _type.setInterestRate(arg);
    }

    private double getInterestRate() {
        return _type.getInterestRate();
    }
}