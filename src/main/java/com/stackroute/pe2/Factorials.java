package com.stackroute.pe2;

public class Factorials {

    public static long longFactorial(long a)
    {
        if(a<0)
            return -1;
        if(a==0)
            return 1;

        long fact = 1;
        for(long i=1;i<=a;i++)
        {
            fact*=i;
            System.out.println("The factorial of "+i+" is "+fact );
        }
        return fact;
    }

    public static int intFactorial(int a)
    {
        if(a<0)
            return -1;
        if(a==0)
            return 1;

        int fact = 1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
            System.out.println("The factorial of "+i+" is "+fact );
        }
        return fact;
    }

    public static void main(String[] args) {
        intFactorial(12);
        longFactorial(20);
    }
}
