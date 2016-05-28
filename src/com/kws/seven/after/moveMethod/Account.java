package com.kws.seven.after.moveMethod;

public class Account {
    private AccountType _type;
    private int _daysOverdrawn;

    public Account(String owner) {
        _type = new AccountType(owner);
    }

    double overdraftCharge() {
        return _type.overdraftCharge(_daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) {
            result += _type.overdraftCharge(_daysOverdrawn);
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
