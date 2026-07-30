//WAP to print sum of first n numbers using recursing -- parameterized way
package Recursion;

import java.util.Scanner;

public class PrintSum1 {

    static Scanner scn = new Scanner(System.in);

    static void printSum(int val,int sum){

        if(val < 0){
            System.out.print("The sum is: "+ sum);
            return;
        }

        printSum(val-1,sum+val);
    }

    public static void main(String[] args){

        System.out.print("Enter a value: ");

        int val = scn.nextInt();

        printSum(val,0);
    }
}
