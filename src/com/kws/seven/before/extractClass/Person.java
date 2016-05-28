package com.kws.seven.before.extractClass;

public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public Person(String name, String officeAreaCode, String officeNumber) {
        _name = name;
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    void setOfficeAreaCode(String officeAreaCode) {
        _officeAreaCode = officeAreaCode;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String officeNumber) {
        _officeNumber = officeNumber;
    }
}
