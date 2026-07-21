package Arrays;

import java.util.Scanner;

public class CountOccurrence {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static int countArray(int[] arr,int num){

        int count = 0;

        for(int ele: arr){

            if(ele == num)
                count++;
        }
        return count;
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter an element to count it occurence in the array: ");
        int num = scn.nextInt();

        System.out.print("The element in the array is present at: "+countArray(arr,num));
    }
}

