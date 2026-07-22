/*Given an integer array sorted in non-decreasing order,
return an array of the square of each no. in non-decreasing order*/

package Arrays;

import java.util.Scanner;

public class SortSquare {

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

    static void sortArray(int[] arr){

        int[] sqArray = new int[arr.length];

        int k = arr.length-1;
        int i=0;
        int j = arr.length-1;

        while (i<j){

            if(-(arr[i]) > arr[j]){
                sqArray[k] = arr[i]*arr[i];
                i++;
                k--;
            }

            else if(-(arr[i]) < arr[j]){
                sqArray[k] = arr[j]*arr[j];
                j--;
                k--;
            }

            else{

                sqArray[k] = arr[j]*arr[j];
                sqArray[k-1] = arr[i]*arr[i];
                i++;
                j--;
                k-=2;
            }

        }

        printArray(sqArray);

    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.println("The original array is:");
        printArray(arr);

        System.out.println();

        System.out.println("The Square array is:");

        sortArray(arr);

    }

}
