//WAP to print Fibonacci nth term
package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    static Scanner scn = new Scanner(System.in);

    static int fib(int val){

        if(val <= 1){
            return val;
        }
        return fib(val-1) + fib(val-2);
    }

    public static void main(String[] args) {

        System.out.print("Enter a value: ");

        int val = scn.nextInt();

        System.out.print("The Fibonacci term at " + val + " is: " + fib(val));
    }
}
