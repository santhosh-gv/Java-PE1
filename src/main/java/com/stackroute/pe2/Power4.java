package com.stackroute.pe2;

public class Power4 {
    private static void power4(int a){

        if(a==0)
        {
            System.out.println("It is not a power of 4");
        }

        else if(a==1)
        {
            System.out.println("It is a power of 4");
        }

        else if(a%4==0)
        {
            power4(a/4);
        }

        else
        {
            System.out.println("It is not a power of 4");
        }
    }

    public static void main(String[] args) {
        int num = 0;
        power4(num);
    }
}
