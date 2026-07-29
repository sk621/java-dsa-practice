package Arrays;

import java.util.Scanner;

public class FindUnique {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int findUnique(int[] arr){

        for(int i=0;i<arr.length;i++){

          boolean isUnique = true;

            for(int j=0;j< arr.length;j++){

                if(i!=j){
                    if(arr[i]==arr[j]) {
                        isUnique = false;
                        break;
                    }
                }
            }
            if(isUnique){
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int uniqueNo = findUnique(arr);

        if(uniqueNo == 0){
            System.out.print("There is no unique number in the array");
        }
        else{
            System.out.print(uniqueNo+" is unique in the array");
        }

    }
}
