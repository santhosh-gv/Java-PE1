package com.stackroute.pe2;

public class ReverseAndPalindrome {

    private static void reversePalindrome(String s)
    {
        String a ="";

        for(int i =s.length()-1;i>=0;i--)
        {
            a+=s.charAt(i);
        }

        if(a.equals(s))
        {
            System.out.println("The given string is a palindrome");
        }

        else
        {
            System.out.println("The given string is not a palindrome");
        }
    }

    public static void main(String[] args) {
        String str = "mam";
        reversePalindrome(str);
    }
}

