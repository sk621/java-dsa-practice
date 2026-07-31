//WAP to print all divisors of a given number
package BasicMaths;

import java.util.Scanner;

public class Divisor {

    static void printDivisor(int num){

        for(int i=1;i*i<=num;i++){

            if(num % i == 0){
                System.out.print(i + " ");
                if(num/i != i)
                    System.out.print(num/i + " ");
            }
        }
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scn.nextInt();

        System.out.println("The divisors of the number are:");

        printDivisor(num);
    }
}
