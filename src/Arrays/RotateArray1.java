// Rotate an array by k steps
package Arrays;

import java.util.Scanner;

public class RotateArray1 {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static void printArray(int[] arr){

        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }

    static void rotateArray(int[] arr, int kStep){

//        for rotate element --> n-k to n-1 || for rest elements --> 0 to n-k-1

        int[] newArray = new int[arr.length];

        int j = 0;

        for(int i= arr.length-kStep;i< arr.length;i++){  // for rotate elements

            newArray[j++] = arr[i];
        }
        for(int i=0;i< arr.length-kStep;i++){     // for rest elements

            newArray[j++] = arr[i];
        }
        printArray(newArray);
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter the no. of steps to rotate: ");

        int kstep = scn.nextInt();

        System.out.println("The original array is:");

        printArray(arr);

        System.out.println();

        System.out.println("The rotated array is: ");

        rotateArray(arr,kstep);

    }
}

