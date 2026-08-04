//WAP to find lower bound of a given element i.e. smallest element just > given element x

package binarysearch;

import java.util.Scanner;

public class UpperBound {

    static Scanner scn = new Scanner(System.in);

    static int findUpperBound(int[] arr,int num){

        int low = 0;
        int high = arr.length-1;
        int index = -1;

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(arr[mid] > num){
                index =  mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return index;
    }

    public static void main (String[] args){

        int[] arr = {1,2,3,5,6,8,9,12,13,15,18};

        System.out.print("Enter an element to find: ");
        int num = scn.nextInt();

        int index = findUpperBound(arr,num);

        if(index != -1){
            System.out.print("Upper bound for " + num + " is exist at index: " + index);
        }
        else{
            System.out.print("There is no upper bound exist for " + num + " in the array");
        }
    }
}
