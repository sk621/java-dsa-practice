//WAP to print numbers from 1 to n using recursion

package Recursion;

import java.util.Scanner;

public class PrintNum1 {

    static Scanner scn = new Scanner(System.in);

    static void printValue(int startVal,int endVal){

        if(startVal > endVal){
            return;
        }
        System.out.println(startVal);

        printValue(startVal+1,endVal);
    }

    public static void main(String[] args){

        System.out.print("Enter start value: ");

        int startVal = scn.nextInt();

        System.out.print("Enter end value: ");

        int endVal = scn.nextInt();

        printValue(startVal,endVal);
    }
}
