//WAP to print subsequence with sum k
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSum {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0; i<arr.length; i++){

            System.out.print("Enter element " + i +": ");

            arr[i] = scn.nextInt();
        }
    }

    static void printSub(int[] arr, int i, ArrayList<Integer> list,int res,int sum){

        if(i >= arr.length){
            if(res == sum){
                System.out.print(list + " ");
            }
            return;
        }

        list.add(arr[i]);
        res += arr[i];
        printSub(arr,i+1,list,res,sum);

        list.removeLast();
        res -= arr[i];
        printSub(arr,i+1,list,res,sum);
    }

    static void main(String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        ArrayList <Integer> list = new ArrayList<>();

        System.out.print("Enter a sum: ");

        int sum = scn.nextInt();

        System.out.println("All the subsequences with sum "+ sum + " of the array are:");

        printSub(arr,0,list,0,sum);
    }
}
