/*WAP to find smallest divisor such the sum is less than or equal to a given
 threshold value when dividing each element of the given array*/

package binarysearch;

import java.util.Scanner;

public class SmallestDivisor {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element " + i + ": ");
            arr[i] = scn.nextInt();
        }
    }

    static int max(int[] arr){

        int max = arr[0];

        for(int ele: arr){

            if(ele > max)
                max =ele;
        }
        return max;
    }

    static boolean isDivisor(int[] arr,int val,int threshold){

        int sum = 0;

        for(int ele: arr){

            sum += (ele + val - 1) / val;
        }
        return sum <= threshold;
    }

    static int findDivisor(int[] arr,int threshold){

        int low = 1;
        int high = max(arr);
        int ans = 1;

        while(low <= high) {

            int mid = low + ((high - low) / 2);

            if (isDivisor(arr, mid, threshold)){

                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    public static void main(String [] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr =new int[size];

        inputArray(arr);

        System.out.print("Enter a threshold value: ");
        int threshold = scn.nextInt();

        System.out.print("The smallest divisor for the given threshold value is: " + findDivisor(arr,threshold));
    }
}
