package Arrays;

import java.util.Scanner;

public class SortOnesZeroes {

    static void printArray(int[] arr){

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    static void swap(int[] arr,int left, int right){

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void sortArray(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            else if(arr[left] == 0)
                left++;

            else
                right--;
        }
    }

    static void main(String[] args){

        int[] arr = {1,0,0,1,0,1,1,1,0,0,1};

        sortArray(arr);

        System.out.println("The sorted array is:");

        printArray(arr);
    }
}
