package com.workintech.model;

public class Person {

   String firstName;
   String lastName;

    int age;

    boolean isMarried;

    double salary;

    String country;

    public Person (String firstName ,String lastName , int age){
        this.firstName= firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName, String lastName , int age, boolean isMarried , double salary , String country){
        this(lastName,firstName,age);
        this.country=country;
        this.salary=salary;
        this.isMarried=isMarried;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public boolean getAge(){
        return 13<=age && age<=19;

    }

}


