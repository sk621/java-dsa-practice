//WAP to search square root of a given number
package binarysearch;

import java.util.Scanner;

public class SquareRoot {

    static Scanner scn = new Scanner(System.in);

    static int findSquareRoot(int num){

        int squareRoot = 0;
        int low = 1;
        int high = num/2;

        if(num <= 1){
            return num;
        }
        while(low <= high){

            int mid = low + ((high - low)/2);

            if(mid * mid <= num){
                squareRoot = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return squareRoot;
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if(num < 0){
            System.out.print("The square root of negative number not exist");
        }

        else System.out.print("The square root of " + num + " is: " + findSquareRoot(num));
    }
}
