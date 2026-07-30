//WAP to print numbers from 1 to n using backtracking
package Recursion;

import java.util.Scanner;

public class PrintNum3 {

    static Scanner scn = new Scanner(System.in);

    static void printValue(int val){

        if(val < 1){
            return;
        }

        printValue(val-1);

        System.out.println(val);
    }

    public static void main(String[] args){

        System.out.print("Enter a value: ");

        int val = scn.nextInt();

        printValue(val);
    }
}
