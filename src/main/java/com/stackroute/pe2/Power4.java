package com.stackroute.pe2;

public class Power4 {
    public static boolean power4(int a){

        if(a==0)
        {
            return false;
        }

        else if(a==1)
        {
            return true;
        }

        else if(a%4==0)
        {
            return power4(a/4);
        }

        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 0;
        power4(num);
    }
}
