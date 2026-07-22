// Find smallest and largest number in the array
package Arrays;

import java.util.Scanner;

public class MinMax {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static void printMinMax(int[] arr){

        System.out.print("The minimum element in the array is: "+arr[0]);

        System.out.println();

        System.out.print("The maximum element in the array is: "+arr[1]);
    }

    static int[] getMinMAx(int[] arr){

        int max = arr[0];

        int min = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min && arr[i]!=max)
                min = arr[i];
        }

        return new int[] {min,max};
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int[] minMaxArr = getMinMAx(arr);

        printMinMax(minMaxArr);

    }
}
