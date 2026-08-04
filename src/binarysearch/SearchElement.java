//WAP to use binary search to search given element in the given array
package binarysearch;

import java.util.Scanner;

public class SearchElement {

    static Scanner scn = new Scanner(System.in);

    static int findElement(int[] arr,int num){

        int low = 0;
        int high = arr.length-1;
        while(low <= high){

           int mid = low + ((high - low)/2);

            if(arr[mid] == num){
                return mid;
            }
            else if(arr[mid] < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main (String[] args){

        int[] arr = {1,2,3,5,6,8,9,12,13,15,18};

        System.out.print("Enter an element to find: ");
        int num = scn.nextInt();

        int index = findElement(arr,num);

        if(index != -1){
            System.out.print(num + " is present at the index " + index);
        }
        else{
            System.out.print(num + " is not present in the array  ");
        }
    }
}
