//WAP to check ith bit of a number is set(1) or not(0)
package bitmanipulation;

import java.util.Scanner;

public class CheckBit {

    static Scanner scn = new Scanner(System.in);

    static int checkNum(int num,int idx){

        if((num & 1 << idx) != 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("Enter ith bit to check: ");
        int idx = scn.nextInt();

        System.out.print("The given bit of the number is: " + checkNum(num,idx));
    }
}
