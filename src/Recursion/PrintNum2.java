//WAP to print numbers from N to 1

package Recursion;

import java.util.Scanner;

public class PrintNum2 {

    static Scanner scn = new Scanner(System.in);

    static void printValue(int endVal){

        if(endVal < 1){
            return;
        }
        System.out.println(endVal);

        printValue(endVal-1);
    }

    public static void main(String[] args){

        System.out.print("Enter end value: ");

        int endVal = scn.nextInt();

        printValue(endVal);
    }
}
