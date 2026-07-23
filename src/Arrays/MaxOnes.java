//WAP to print the count of maximum consecutive ones
package Arrays;

import java.util.Scanner;

public class MaxOnes {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int countOnes(int[] arr){

        int count = 0;
        int maxCount = 0;

        for(int ele: arr){
            if(ele == 1){
                count++;
                maxCount = count;
            }
            else count = 0;
        }
        return maxCount;
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("The maximum 1 in the array is: "+ countOnes(arr));

    }
}