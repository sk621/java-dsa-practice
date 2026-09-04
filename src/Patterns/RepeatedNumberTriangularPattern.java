package Patterns;

import java.util.Scanner;

public class RepeatedNumberTriangularPattern {
    static Scanner scn = new Scanner(System.in);

    static void printPattern(int val){

        for(int i = 1; i <= val; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        System.out.print("Enter a value: ");

        int val = scn.nextInt();

        System.out.println("The star square pattern is:");

        printPattern(val);
    }
}
