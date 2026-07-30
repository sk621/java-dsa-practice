//WAP to check whether a given string is palindrome or not
package Recursion;

import java.util.Scanner;

public class CheckPalindrome {

    static Scanner scn = new Scanner(System.in);

    static boolean isPalindrome(int start,String str){

        if(start > str.length()/2) {
            return true;
        }
        if(str.charAt(start) != str.charAt(str.length()-1-start))
            return false;

        return isPalindrome(start+1,str);
    }

    public static void main(String[] args){

        System.out.print("Enter a string: ");

        String str = scn.nextLine();

        if(isPalindrome(0,str)){
            System.out.print("The given string is palindrome");
        }
        else{
            System.out.print("The given string is not palindrome");
        }
    }
}
