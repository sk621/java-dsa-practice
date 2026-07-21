package Arrays;

import java.util.Scanner;

public class ReverseArray {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static void printArray(int[] arr){

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    static void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<arr.length/2){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.println("The original array is:");

        printArray(arr);

        reverse(arr);

        System.out.println();

        System.out.println("After reverse the array is:");

        printArray(arr);

    }
}

