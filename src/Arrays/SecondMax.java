//WAP to find second largest element in the array
package Arrays;

import java.util.Scanner;

public class SecondMax {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int findSecMax(int[] arr){

        int max = arr[0];
        int secMax = Integer.MIN_VALUE;

        for(int ele: arr){
            if(ele > max){
                secMax = max;
                max = ele;
            }
            else if(ele > secMax && ele!= max){
                secMax = ele;
            }
        }
        return secMax;
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int secMax = findSecMax(arr);

        if(secMax == Integer.MIN_VALUE)
            System.out.print("There is no second largest number in the array");
        else
            System.out.print(secMax +" is second largest number in the array");

    }
}
