//WAP to find the missing element in the array from 1 to n
package Arrays;

import java.util.Scanner;

public class MissingElement {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }


    static int findMissing(int[] arr){

        int totalSum = (arr.length*(arr.length+1))/2;

        int sum = 0;

        for(int ele: arr){
            sum += ele;
        }

        return sum - totalSum;
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("The missing element is: "+ findMissing(arr));

    }
}
