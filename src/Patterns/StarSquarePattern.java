package Patterns;

import java.util.Scanner;

public class StarSquarePattern {
    static Scanner scn = new Scanner(System.in);

    static void printPattern(int val){

        for(int i=0;i<val;i++){

            for(int j=0;j<val;j++){

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
