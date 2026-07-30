//WAP to store unique number in the array and count the unique number
package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static void printArray(int[] arr){

        System.out.println("Array with uniques values are: ");

        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }

    static int removeduplicates(int[] arr){

        int i = 0;
        //store unique numbers
        for(int j=0;j<arr.length;j++){

            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        //store 0 in rest places
        for(int j=i+1;j<arr.length;j++){
            arr[j] = 0;
        }
        return i;
    }

    static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int countUnique = removeduplicates(arr);

        if(countUnique == 0){
            System.out.println("There is no unique numbers are in the array");
        }
        else{
            System.out.println(countUnique+" unique number in the array");
        }

        printArray(arr);


    }
}
