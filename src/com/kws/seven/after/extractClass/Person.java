package com.kws.seven.after.extractClass;

public class Person {
    private String _name;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public Person(String name, String officeAreaCode, String officeNumber) {
        _name = name;
        _officeTelephone.setAreaCode(officeAreaCode);
        _officeTelephone.setNumber(officeNumber);
    }

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return _officeTelephone;
    }

    class TelephoneNumber {
        private String _areaCode;
        private String _number;

        public String getTelephoneNumber() {
            return ("(" + _areaCode + ")" + _number);
        }

        String getAreaCode() {
            return _areaCode;
        }

        void setAreaCode(String areaCode) {
            _areaCode = areaCode;
        }

        String getNumber() {
            return _number;
        }

        void setNumber(String number) {
            _number = number;
        }
    }
}
