package com.kws.seven.after.inlineClass;

public class Person {
    private String _name;
    private TelephoneNumberOld _officeTelephone = new TelephoneNumberOld();

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

//    TelephoneNumberOld getOfficeTelephone() {
//        return _officeTelephone;
//    }

    String getAreaCode() {
        return _officeTelephone.getAreaCode();
    }

    void setAreaCode(String arg) {
        _officeTelephone.setAreaCode(arg);
    }

    String getNumber() {
        return _officeTelephone.getNumber();
    }

    void setNumber(String arg) {
        _officeTelephone.setNumber(arg);
    }
}
