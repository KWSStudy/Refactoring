package com.kws.seven.after.moveMethod;

public class AccountType {
    private String _owner;

    public AccountType(String owner) {
        _owner = owner;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    boolean isPremium() {
        switch (_owner) {
            case "홍길동":
                return true;
            default:
                return false;
        }
    }
}
