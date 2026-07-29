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
        System.out.println();
    }

    static void sqrArray(int[] arr){

        int[] squareArr = new int[arr.length];

        int left = 0;
        int right = arr.length-1;
        int i = arr.length-1;

        while (left<right){

            if(Math.abs(arr[right]) >= Math.abs(arr[left])){
                squareArr[i--] = arr[right] * arr[right];
                right--;
            }
            else {
                squareArr[i--] = arr[left] * arr[left];
                left++;
            }
        }

        printArray(squareArr);

    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.println("The original array is:");

        printArray(arr);

        System.out.println("The Square array is:");

        sqrArray(arr);

    }

}
