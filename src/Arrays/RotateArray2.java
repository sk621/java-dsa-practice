package Arrays;

import java.util.Scanner;

public class RotateArray2 {

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

    static void reverseArray(int[] arr,int start,int end){

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

        System.out.print("Enter steps to rotate the array: ");
        int ksteps = scn.nextInt();

        System.out.println("The original array is:");

        printArray(arr);

        System.out.println();

        reverseArray(arr,arr.length-ksteps, arr.length-1);
        reverseArray(arr,0, arr.length-ksteps-1);
        reverseArray(arr,0, arr.length-1);

        System.out.println("The rotated array is:");

        printArray(arr);
    }
}
