//WAP to invert all bits of a given binary value
package bitmanipulation;

import java.util.Scanner;

public class InvertAllBits {

    static Scanner scn = new Scanner(System.in);

    static String invertBits(String str) {

        StringBuilder invertedStr = new StringBuilder(str);

        for (int i = 0; i < invertedStr.length(); i++) {

            if (invertedStr.charAt(i) == '1')
                invertedStr.setCharAt(i,'0');
            else
                invertedStr.setCharAt(i,'1');
        }
        return invertedStr.toString();
    }

    public static void main(String[] args){

        System.out.print("Enter a binary value: ");
        String binaryVal = scn.next();

        System.out.print("The inverted bits of the binary value is: " + invertBits(binaryVal));
    }
}
