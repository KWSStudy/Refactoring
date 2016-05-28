package com.kws.seven.after.hideDelegate;

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

    public String getName() {
        return _name;
    }

    public Person getManager() {
        return _department.getManager();
    }
}
