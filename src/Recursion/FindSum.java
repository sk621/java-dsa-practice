//WAP to print sum of first n numbers using recursion -- functional way
package Recursion;

import java.util.Scanner;

public class FindSum {

    static Scanner scn = new Scanner(System.in);

    static int calSum(int val){

        if(val == 0){
            return 0;
        }

        return val + calSum(val-1);
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");

        int val = scn.nextInt();

        System.out.print("The sum of first "+ val + " number is: " + calSum(val));
    }
}
