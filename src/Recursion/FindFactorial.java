//WAP to find factorial of a number
package Recursion;

import java.util.Scanner;

public class FindFactorial {

    static Scanner scn = new Scanner(System.in);

    static int fact(int val){

        if(val == 1){
            return 1;
        }

        return val * fact(val-1);
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        System.out.print("The factorial of " + num + " is: " + fact(num));
    }
}
