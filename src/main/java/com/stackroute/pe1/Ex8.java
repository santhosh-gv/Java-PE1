package com.stackroute.pe1;

import java.util.Scanner;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1-100");
        Scanner obj = new Scanner(System.in);

        Random rand = new Random();
        int target = rand.nextInt(100)+1;


        while (obj.hasNextInt())
        {
            int n = obj.nextInt();

            if(n>target)
            {
                System.out.println("Number guessed is more than original number");
            }
            else if(n < target)
            {
                System.out.println("Number guessed is less than original number");
            }
            else
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }
}
