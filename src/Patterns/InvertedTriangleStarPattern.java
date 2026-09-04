package Patterns;

import java.util.Scanner;
public class InvertedTriangleStarPattern {

    static Scanner scn = new Scanner(System.in);

    static void printPattern(int val){

        for(int i = 1; i <= val; i++){

            for(int j = 1; j <= val-i+1; j++){

                System.out.print("*");
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
