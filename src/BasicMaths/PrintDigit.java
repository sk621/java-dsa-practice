//WAP to print all the digits of a number
package BasicMaths;

import java.util.Scanner;

public class PrintDigit {

    static void printDigit(int num){

        int digit = 0;

        while(num != 0){

            digit = num % 10;

            System.out.println(digit);

            num /= 10;
        }

    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        System.out.println("The digits of the number are:");

        printDigit(num);
    }
}

