package Arrays;

import java.util.Scanner;

public class MaxArray {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int maxValue(int[] arr){

        int max = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max)
                max= arr[i];
        }

        return max;
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("The maximum element in the array is: "+maxValue(arr));
    }

}
