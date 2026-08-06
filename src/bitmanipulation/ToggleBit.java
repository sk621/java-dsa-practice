//WAP to toggle a given bit of a number
package bitmanipulation;

import java.util.Scanner;

public class ToggleBit {

    static Scanner scn = new Scanner(System.in);

    static int checkBit(int num,int idx){

        if((num & 1 << idx) != 0) {
            return 1;
        }

        return 0;
    }

    static int toggleBit(int num,int idx){

        return num ^ 1<<idx;
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("Enter ith bit to set: ");
        int idx = scn.nextInt();

        System.out.println("The given bit of the number is: " + checkBit(num,idx));

        int setNum = toggleBit(num,idx);

        System.out.print("The given bit of the number after set: " + checkBit(setNum,idx));
    }
}
