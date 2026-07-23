//WAP to move zeroes at the end && preserving the original order of non-zero numbers
package Arrays;

import java.util.Scanner;

public class MoveZeroes2 {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static void printArray(int[] arr){

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }

    static void swap(int[]arr, int left, int right){

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void MoveZeroes(int[] arr){

        int left = 0;

        for(int right=1;right<arr.length;right++){

            if(arr[left] == 0 && arr[right] != 0){
                swap(arr,left,right);
                left++;
            }
            else if(arr[left] != 0)
                left++;
        }
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("The original array is: ");

        printArray(arr);

        System.out.println();

        MoveZeroes(arr);

        System.out.print("The updated array is: ");

        printArray(arr);
    }
}
