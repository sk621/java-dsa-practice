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

    static void sortArray(int[] arr){

        int[] sqArray = new int[arr.length];

        int left = 0;
        int right = arr.length-1;
        int i = arr.length-1;

        while (i>0){

            if(Math.abs(arr[right]) >= Math.abs(arr[left])){
                sqArray[i] = arr[right] * arr[right];
                right--;
            }
            else{
                sqArray[i] = arr[left] * arr[left];
                left++;
            }
            i--;
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

        System.out.println("The Square array is:");

        sortArray(arr);

    }

}
