package com.stackroute.pe1;

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.next();
// use ASCII codes to check for letters
        for(int i = 0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch>=65 && ch <= 90 || ch>=97 && ch <= 122) {
                if (ch == 'a' || ch == 'A' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'U' || ch == 'u') {
                    System.out.print("Vowel ");
                } else {
                    System.out.print("Consonant ");
                }
            }
            else{
                System.out.print(" Not a letter ");

            }

        }

    }
}
