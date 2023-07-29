package com.workintech.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------");
        Person person = new Person("John ", "Doe ", 20 , false ,16000 , "Türkiye" );
        System.out.println(person.lastName + person.firstName+person.age);
        System.out.println(person.isMarried+" " + person.country+" " + person.salary);
        System.out.println("FirstName: "+person.getFirstName());
        System.out.println("LastName: "+person.getLastName());
        System.out.println("Age: "+person.getAge());
        System.out.println("--------------------------------");
        Wall wall = new Wall(15 , 12);
        System.out.println(wall.width);
        System.out.println(wall.height);
        System.out.println("getArea: " +wall.getArea());
    }
}