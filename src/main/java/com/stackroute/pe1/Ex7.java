package com.stackroute.pe1;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int length =0;
        int n = num;

        while (n>0)
        {
            n/=10;
            length++;
        }
        int[] arr = new int[length];
        n = num;
        for(int i=0;i<length;i++)
        {
            arr[i]=n%10;
            n/=10;
        }

        for(int i =0; i<length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");

        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0; i<length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
