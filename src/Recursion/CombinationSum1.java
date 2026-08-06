//WAP to print the combination of all elements(can be repeated) equal to the target Sum given

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum1 {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++) {

            System.out.print("Enter element " + i + ": ");
            arr[i] = scn.nextInt();
        }
    }

    static void findCombinationSum(int[] arr, int i, ArrayList<Integer> list,int targetSum) {

        if (i >= arr.length) {
            if (targetSum == 0){
                System.out.print(list + " ");
            }
             return;
        }

        if(arr[i] <= targetSum){
            list.add(arr[i]);
            findCombinationSum(arr,i,list,targetSum-arr[i]);
            list.removeLast();
        }
        findCombinationSum(arr,i+1,list,targetSum);
    }

    public static void main(String[] args){

        System.out.print("Enter size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter a target sum: ");
        int sum = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("The combination of elements whose sum is equal to " + sum + " are:");

        findCombinationSum(arr,0,list,sum);
    }
}
