//WAP to count the digits in the given number
package BasicMaths;

import java.util.Scanner;

public class CountDigit {

    static int countDigit(int num){

        int count = 0;

        while(num != 0){

            num /= 10;

            count ++;
        }
        return count;
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        System.out.println("The number of digits in " + num + " is:" + countDigit(num));


    }
}
