package com.stackroute.pe2;

public class EvenNumTest {



    public static boolean isEven(int a){
        if(a<0)
        {
            return false;
        }
        else if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(isEven(num));
    }
}
