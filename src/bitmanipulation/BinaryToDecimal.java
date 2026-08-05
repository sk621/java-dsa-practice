//WAP to convert a binary number to its decimal equivalent

package bitmanipulation;

import java.util.Scanner;

public class BinaryToDecimal {

    static Scanner scn = new Scanner(System.in);

    static int convertDecimal(String str){

        int num = 0;
        int powerTwo = 1;

        for(int i = str.length()-1; i>=0; i--){

            if(str.charAt(i) == '1') {
                num += powerTwo;
            }
            powerTwo *= 2;
        }
        return num;
    }

    public static void main(String[] args){

        System.out.print("Enter a binary value: ");

        String str = scn.next();

        int num = convertDecimal(str);
        System.out.print("The decimal value of " + str + " is: " + convertDecimal(str));
    }
}
