package Arrays;

import java.util.Scanner;

public class FindElement {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();
        }
    }

    static int checkArray(int[] arr,int num){

        int idx = -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i] == num){
                idx = i;
                break;
            }
        }
        return idx;
    }

    static void main (String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter an element to find in the array: ");
        int num = scn.nextInt();

        System.out.print("The element in the array is present at: "+checkArray(arr,num));
    }
}

