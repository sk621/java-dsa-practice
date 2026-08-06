//WAP to unset rightmost bit of a number
package bitmanipulation;

import java.util.Scanner;

public class UnsetLastBit {

    static Scanner scn = new Scanner(System.in);

    static int unsetLastBit(int num){

        return num & num-1;
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("The new number obtained: " + unsetLastBit(num));
    }
}
