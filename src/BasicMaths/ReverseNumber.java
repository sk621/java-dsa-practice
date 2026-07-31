package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int num){

        int reverse = 0;

        while (num != 0){

            reverse = (reverse * 10) + num % 10;

            num/=10;
        }
        return reverse;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        System.out.print("The reverse of " + num + " is: " + reverse(num));
    }
}
