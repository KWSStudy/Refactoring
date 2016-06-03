package com.kws.eight.fourteen;

abstract class Employee {
    private int type;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int arg) {
        switch (arg) {
        case ENGINEER:
            return new Engineer(ENGINEER);
        case SALESMAN:
//          return new Salesman();
        case MANAGER:
//          return new Manage();
        default:
            throw new IllegalArgumentException("Incorrect");
        }
    }

    public Employee(int arg) {
        this.type = arg;
    }

    // public int getType() {
    // return type;
    // }

    abstract int getType();

    public void setType(int type) {
        this.type = type;
    }

}
