//WAP to convert given decimal to its binary equivalent

package bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {

    static Scanner scn = new Scanner(System.in);

    static String convertBinary(int num){

        StringBuilder str = new StringBuilder();

        while(num != 0){

            str.append(num % 2);
            num /= 2;

        }
        return str.reverse().toString();
    }

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        System.out.print("The binary equivalent of " + num + " is: " + convertBinary(num));
    }
}
