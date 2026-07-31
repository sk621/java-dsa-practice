//WAP to print all the subsequences of a given array
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0; i<arr.length; i++){

            System.out.print("Enter element " + i +": ");

            arr[i] = scn.nextInt();
        }
    }

    static void printSub(int[] arr,int i,ArrayList<Integer> list){

        if(i >= arr.length){
            System.out.print(list + " ");
            return;
        }

        list.add(arr[i]);
        printSub(arr,i+1,list);

        list.remove(Integer.valueOf(arr[i]));
        printSub(arr,i+1,list);
    }

    static void main(String[] args){

        System.out.print("Enter size of the array: ");

        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        ArrayList <Integer> list = new ArrayList<>();

        System.out.println("All the subsequences of the array are:");

        printSub(arr,0,list);
    }
}
