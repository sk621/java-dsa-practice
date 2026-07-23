//WAP to move zeroes at the end
package Arrays;

import java.util.Scanner;

public class MoveZeroes1 {

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
        int right = arr.length-1;

        while(left < right){

            if(arr[left] == 0 && arr[right] != 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            else if(arr[right] == 0)
                right--;
            else
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

