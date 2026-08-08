//WAP to search an element in a rotated sorted array with duplicate elements --  either one part is sorted always
package binarysearch;

import java.util.Scanner;

public class SearchInRotatedArrII {

    static Scanner scn = new Scanner(System.in);

    static int findTargetIdx(int[] arr,int target){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(arr[mid] == target)
                return mid;

            if(arr[low] <= arr[mid] && arr[mid] <= arr[high]){
                low++;
                high--;
            }

//            check in left sorted part
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;                          //if exist in left sorted part
                }
                else low = mid + 1;                           //if not go for right unsorted part
            }

//            check in right sorted part
            else if(arr[mid] <= arr[high]){
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;                          //if exist in right sorted part
                }
                else high = mid - 1;                           //if not go for left unsorted part
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {3,3,1,2,3,3,3};

        int targetElement = 1;

        System.out.print("The index of the target element is: " + findTargetIdx(arr,targetElement));
    }
}
