package Arrays;

import java.util.Scanner;

public class LastOccurrence {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static int lastIndex(int[] arr,int num) {

        int lastIdx = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num)
                lastIdx = i;
        }
        return lastIdx;
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter an element to find its last index the array: ");
        int num = scn.nextInt();

        System.out.print("The last index of the element is: "+lastIndex(arr,num));
    }
}
