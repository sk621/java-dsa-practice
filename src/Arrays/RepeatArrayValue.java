package Arrays;

import java.util.Scanner;

public class RepeatArrayValue {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int findRepeatValue(int[] arr){

        for(int i=0;i<arr.length;i++){

            for(int j=0;j< arr.length;j++){

                if(i!=j){
                    if(arr[i]==arr[j]) {
                        return arr[i];
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int repeatValue = findRepeatValue(arr);

        if(repeatValue == 0){
            System.out.print("There is no repeated value in the array");
        }
        else{
            System.out.print(repeatValue+" is repeated value in the array");
        }

    }
}
