//WAP to check whether a given number is a power of 2 or not
package bitmanipulation;

import java.util.Scanner;

public class CheckPowerOfTwo {

    static Scanner scn = new Scanner(System.in);

    static boolean checkNum(int num){

//        if((num & num - 1) == 0){
//            return true;
//        }
//        return false;

        return (num & num - 1) == 0;
    }

    public static void main(String[] args){

        System.out.print("Enter a  number: ");
        int num = scn.nextInt();

        if(num <= 0){
            System.out.print("Number less than 1 is not a power of 2");
        }

        else if(checkNum(num))
            System.out.print(num + " is a power of 2");

        else
            System.out.print(num + " is not a power of 2");
    }
}
