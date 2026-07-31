//WAP to check a given number is palindrome or not
package BasicMaths;

import java.util.Scanner;

public class CheckPalindrome {

    static int reverse(int num){

        int reverse = 0;

        while(num != 0){

            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }
        return reverse;
    }

    static void checkNum(int num){

        if(reverse(num) == num){
            System.out.print("The given number is palindrome");
        }
        else
            System.out.print("The given number is not palindrome");
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        checkNum(num);
    }
}
