//WAP to print digits of a number
package Recursion;

import java.util.Scanner;

public class PrintDigit {

    static void printDigit(int num){

        if(num==0) {
            return;
        }
        printDigit(num/10);

        System.out.println(num%10);
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.println("The digits of the number are:");

        if(num == 0){
            System.out.print(num);
        }
        else
            printDigit(Math.abs(num));
    }
}
