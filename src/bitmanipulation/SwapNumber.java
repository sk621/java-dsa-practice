//WAP to swap two numbers using XOR
package bitmanipulation;

import java.util.Scanner;

public class SwapNumber {

    static Scanner scn = new Scanner(System.in);

    static void swap(int num1,int num2){

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1: " + num1);
        System.out.print("num2: " +num2);

    }

    public static void main(String[] args){

        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        System.out.println("Numbers before Swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " +num2);

        System.out.println("Numbers after Swapping:");

        swap(num1,num2);

        scn.close();
    }
}
