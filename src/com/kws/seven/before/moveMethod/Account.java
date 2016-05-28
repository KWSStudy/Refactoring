package com.kws.seven.before.moveMethod;

public class Account {
    private AccountType _type;
    private int _daysOverdrawn;

    public Account(String owner) {
        _type = new AccountType(owner);
    }

    double overdraftCharge() {
        if (_type.isPremium()) {
            double result = 10;
            if (_daysOverdrawn > 1) {
                result += (_daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return _daysOverdrawn * 1.75;
        }
    }

    public double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }

    public void setDayOverdrawn(int dayOverdrawn) {
        _daysOverdrawn = dayOverdrawn;
    }

    public int getDayOverdrawn() {
        return _daysOverdrawn;
    }
}
