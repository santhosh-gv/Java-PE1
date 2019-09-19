package com.stackroute.pe2;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public void setAge(int age) {
        System.out.println("Enter an age between 0 to 100");
        this.age = age;
    }

    public void isAgeValid(int age)
    {
        if(age>=18 && age<=60)
        {
            System.out.println("Valid Age");
        }
        else
            System.out.println("Invalid Age");
    }

    public String getFullName(String firstName, String lastName)
    {
        return firstName+" "+lastName;
    }


}
