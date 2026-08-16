// WAP to find minimum no. of days to make M bouquets using the given no. of combination k


package binarysearch;

import java.util.Scanner;

public class NumberOfBouquets {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[] arr){

        for(int i=0;i<arr.length;i++) {

            System.out.print("Enter days to bloom flower " + i + ": ");

            arr[i] = scn.nextInt();
        }
    }

    static int min(int[] arr){

        int min = arr[0];

        for(int ele: arr){

            if(ele < min)
                min = ele;
        }
        return min;
    }

    static int max(int[] arr){

        int max = arr[0];

        for(int ele: arr){

            if(ele > max)
                max = ele;
        }
        return max;
    }

    static boolean isPossible(int[] arr,int day,int bouquets,int flower){

        int totalBouquets = 0;
        int countBloomFlower = 0;

        for(int ele: arr){

            if(day >= ele)
                countBloomFlower++;

            else{

                totalBouquets += countBloomFlower/flower;

                countBloomFlower = 0;
            }

        }
        totalBouquets += countBloomFlower/flower;

        return totalBouquets >= bouquets;
    }

    static int findMinimumDays(int[] arr,int bouquets,int flower){

        int days = 0;
        int low = min(arr);
        int high = max(arr);

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (isPossible(arr, mid, bouquets, flower)){
                days = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return days;
    }

    public static void main(String[] args){

        System.out.print("Enter no. of flowers: ");
        int size = scn.nextInt();

        int[] arr = new int[size];

        inputArray(arr);

        System.out.print("Enter no. of bouquets to make: ");
        int bouquets = scn.nextInt();

        System.out.print("Enter no. of least flowers required to make one bouquet: ");
        int flower = scn.nextInt();

        if(arr.length < bouquets * flower) {
            System.out.print("No bouquets can be made with such combination");
            return;
        }

        System.out.print("Minimum days to make " + bouquets + " bouquets is: " + findMinimumDays(arr,bouquets,flower));
    }
}
