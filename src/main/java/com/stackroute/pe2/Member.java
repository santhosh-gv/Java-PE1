package com.stackroute.pe2;

class Member {

    private String name;
    private int age;
    private double salary;

    Member()
    {
        name = "Harry Potter";
        age = 30;
        salary = 2500.3;

    }

    public void printDetails()
    {
        System.out.println("Members Name: " + name);
        System.out.println("Members Age: " + age);
        System.out.println("Members Salary: " + salary);
    }

}



