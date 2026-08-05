/* WAP to return the first and last occurrences of a given element {first,last}
    if not present then return {-1,-1}
*/
package binarysearch;

import java.util.Scanner;

public class FirstAndLastOccurrence {

    static Scanner scn = new Scanner(System.in);

    static int firstOccurrence(int[] arr,int num){

        int low = 0;
        int high = arr.length-1;
        int mid = -1;
        int firstIdx = -1;

        while(low <= high){

            mid = low + ((high - low)/2);

            if(arr[mid] == num){
                firstIdx = mid;
                high = mid - 1;
            }
            else if(arr[mid] > num){
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return firstIdx;
    }

    static int lastOccurrence(int[] arr,int num){

        int low = 0;
        int high = arr.length-1;
        int mid = -1;
        int lastIdx = -1;

        while(low <= high){

            mid = low + ((high - low)/2);

            if(arr[mid] == num){
                lastIdx = mid;
                low = mid + 1;
            }
            else if(arr[mid] > num){
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return lastIdx;
    }

    static int[] findOccurrence(int[] arr,int num){

        int firstIdx = firstOccurrence(arr,num);

        if(firstIdx == -1)
            return new int[] {-1,-1};

        int lastIdx = lastOccurrence(arr,num);

        return new int[] {firstIdx,lastIdx};
    }

    static void main (String[] args){

        int[] arr = {1,2,4,6,8,8,8,9,10,11,12};

        System.out.print("Enter an element to find its first and last occurrence: ");
        int num = scn.nextInt();

        System.out.print("The first & last occurrences of " + num + " is: ");

        int[] occr = findOccurrence(arr,num);

        for(int ele: occr){
            System.out.print(ele + " ");
        }

    }

}
