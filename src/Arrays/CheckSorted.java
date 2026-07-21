package Arrays;

import java.util.Scanner;

public class CheckSorted {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static boolean checkArray(int[] arr) {

        boolean isSorted = true;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        if(checkArray(arr)) {
            System.out.print("The array is sorted");
        } else
            System.out.print("The array is not sorted");
    }
}

