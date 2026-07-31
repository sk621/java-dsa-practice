//WAP to check whether a given number is prime or not
package BasicMaths;

import java.util.Scanner;

public class CheckPrime {

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

    static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if(num < 2 || !checkPrime(num)) {
            System.out.print(num + " is not a prime number");
        }
        else {
            System.out.print(num + " is a prime number");
        }
    }
}
