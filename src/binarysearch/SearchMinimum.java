//WAP to search minimum element in rotated sorted array
package binarysearch;

import java.util.Scanner;

public class SearchMinimum {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element " + i + ": ");
            arr[i] = scn.nextInt();
        }
    }

    static int findMinimum(int[] arr){

        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(low <= high) {

            int mid = low + ((high - low) / 2);

            if (arr[mid] < min) {
                min = arr[mid];
            }
//            check for duplicate values
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
//            check for left sorted part
            else if (arr[low] <= arr[mid]) {
                if (arr[low] <= min) {
                    min = arr[low];
                }
                    low = mid + 1;             // also check for right unsorted part
            }
//            check for right unsorted part
            else {
                high = mid - 1;
                if(arr[mid] <= min){
                    min = arr[mid];
                }
            }
        }
        return min;
    }

    public static void main(String[] args){

        System.out.print("Enter size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("The minimum element in the array is: " + findMinimum(arr));
    }
}
