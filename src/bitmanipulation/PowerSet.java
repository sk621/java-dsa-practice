//WAP to print power set (all the subsets) of a given array
package bitmanipulation;

import java.util.Scanner;
import java.util.ArrayList;
public class PowerSet {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0; i<arr.length; i++){

            System.out.print("Enter element " + i + ": ");
            arr[i] = scn.nextInt();
        }
    }

    static ArrayList<ArrayList<Integer>> findPowerSet(int[] arr){

       ArrayList<ArrayList<Integer>> powerList = new ArrayList<>();

        for(int i=0; i<(1<<arr.length); i++){

            ArrayList<Integer> list = new ArrayList<>();

            for(int j=0; j< arr.length;j++){

                if((i & 1<<j) != 0){
                    list.add(arr[j]);
                }
            }

            powerList.add(list);
        }
        return powerList;
    }

    public static void main(String[] args){

        System.out.print("Enter size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.println("The power set of the given array is:");

        System.out.println(findPowerSet(arr));
    }
}
