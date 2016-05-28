package com.kws.seven.after.removeMiddleMan;

public class Person {
    String _name;
    Department _department;

    public Person(String name) {
        _name = name;
        _department = null;
    }

    public Person(String name, Person manager) {
        _name = name;
        _department = new Department(manager);
    }

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department arg) {
        _department = arg;
    }

    public String getName() {
        return _name;
    }
}
