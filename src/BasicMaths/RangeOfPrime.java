//WAP to print all prime numbers in a given range
package BasicMaths;

import java.util.Scanner;

public class RangeOfPrime {

    static boolean checkPrime(int num){

        boolean isPrime = true;

        for(int i=2; i*i <= num; i++){

            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static void printPrime(int start,int end){

        System.out.println("The prime numbers between " +  start + " and " + end + " are:");

        while(start <= end){

            if(checkPrime(start)) {
                System.out.print(start + " ");
            }
            start++;
        }
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter start value: ");
        int start = scn.nextInt();

        if(start < 2){
            System.out.print("Please enter valid start value");
            return;
        }

        System.out.print("Enter end value: ");
        int end = scn.nextInt();

        printPrime(start,end);
    }
}
