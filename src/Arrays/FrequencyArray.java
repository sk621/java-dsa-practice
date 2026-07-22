//check if a range of numbers present in the array or not
package Arrays;

import java.util.Scanner;

public class FrequencyArray {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print("Enter element"+i+": ");
            arr[i] = scn.nextInt();

        }
    }

    static int findMax(int[] arr){

        int max = arr[0];

        for(int ele: arr){
            if(ele>max)
                max = ele;
        }
        return max;
    }

    static void countFrequency(int[] arr, int[] freArr){

        for (int ele : arr) {

            freArr[ele] += 1;
        }
    }

    static void printFrequency(int[] freqArr, int query){

        while(query > 0){

            System.out.print("Enter a number: ");
            int num = scn.nextInt();

            System.out.println("The frequency of "+num+" in the array is: "+freqArr[num]);

            query--;
        }
    }

    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        int max = findMax(arr);

        int[] freqArr = new int[max+1];

        countFrequency(arr,freqArr);

        System.out.print("Enter no. of queries: ");
        int query = scn.nextInt();

        printFrequency(freqArr,query);

    }
}
