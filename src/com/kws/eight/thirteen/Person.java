package com.kws.eight.thirteen;

class Person{

    private BloodGroup bloodgroup;

    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

//  private int bloodGroup;

    public Person(BloodGroup arg){
//      this.bloodGroup = arg;
        this.bloodgroup = arg;
    }

    public BloodGroup getBloodGroup() {
//      return bloodGroup;
        return bloodgroup;
    }

    public void setBloodGroup(BloodGroup arg) {
        this.bloodgroup = arg;
    }

    public static void main(String[] args) {

//      Person thePerson = new Person(Person.A);
        Person thePerson = new Person(BloodGroup.A);

        thePerson.getBloodGroup().getCode();

//      thePerson.setBloodGroup(Person.AB);
        thePerson.setBloodGroup(BloodGroup.AB);
    }
}
