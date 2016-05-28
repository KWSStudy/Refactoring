package com.kws.seven.before.moveMethod;

public class AccountType {
    private String _owner;

    public AccountType(String owner) {
        _owner = owner;
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