package com.stackroute.pe2;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of students: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int[] marks = new int[n];
        int avg=0,min=1000,max=-10;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the grade for student "+ (i+1)+":");
            marks[i]=obj.nextInt();
            avg+=marks[i];
            if(marks[i]<min)
            {
                min=marks[i];
            }

            if(marks[i]>max)
            {
                max=marks[i];
            }
        }

        System.out.println("The average is "+avg/n);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);


    }
}
