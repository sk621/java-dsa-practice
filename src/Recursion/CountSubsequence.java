//WAP to count the subsequences with k
package Recursion;

import java.util.Scanner;

public class CountSubsequence {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element " + i + ": ");

            arr[i] = scn.nextInt();
        }
    }

    static int countSub(int[] arr,int i,int res,int sum){

        if(i >= arr.length){
            if(res == sum){
                return 1;
            }
            return 0;
        }

        res += arr[i];
        int l =  countSub(arr,i+1,res,sum);

        res -= arr[i];
        int r =  countSub(arr,i+1,res,sum);

        return l+r;
    }

    public static void main(String[] args){

        System.out.print("Enter a size: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter a sum: ");

        int sum = scn.nextInt();

        int count = countSub(arr,0,0,sum);

        System.out.print("The no. of subsequences with sum " + sum + " is: " + count);
    }
}
