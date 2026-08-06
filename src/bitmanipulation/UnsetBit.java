//WAP to unset a given bit of a number
package bitmanipulation;

import java.util.Scanner;

public class UnsetBit {

    static Scanner scn = new Scanner(System.in);

    static int checkBit(int num,int idx){

        if((num & 1 << idx) != 0) {
            return 1;
        }

        return 0;
    }

    static int unsetBit(int num,int idx){

        return num & ~(1<<idx);
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("Enter ith bit to unset: ");
        int idx = scn.nextInt();

        System.out.println("The given bit of the number is: " + checkBit(num,idx));

        int setNum = unsetBit(num,idx);

        System.out.print("The given bit of the number after unset: " + checkBit(setNum,idx));
    }
}

