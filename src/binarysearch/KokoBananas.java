/*WAP to return the minimum integer k -- bananas per hr such that all bananas can be
 eaten by koko within the given hours */

package binarysearch;

import java.util.Scanner;

public class KokoBananas {

    static Scanner scn = new Scanner(System.in);

    static void inputBananas(int[] pile){

        for(int i=0;i<pile.length;i++){

            System.out.print("Enter bananas in pile " + i + ": ");
            pile[i] = scn.nextInt();
        }
    }

    static int findMax(int[] pile){

        int max = pile[0];

        for(int ele: pile){

            if(ele > max)
                max = ele;
        }
        return max;
    }

    static int calcTotalHours(int[] pile,int val){

        int totalHour = 0;

        for(int bananas: pile){

            totalHour = totalHour + ((bananas + val - 1) / val);

        }
        return totalHour;
    }

    static int rateOfBananas(int[] pile,int hours){

        int rate = 0;
        int low = 1;
        int high = findMax(pile);

        while(low <= high){

            int mid = low + ((high - low)/2);

            int totalHour = calcTotalHours(pile,mid);

            if(totalHour <= hours){
                rate = mid;
                high = mid -1;
            }
            else low = mid + 1;
        }
        return rate;
    }

    public static void main(String[] args){

        System.out.print("Enter no. of piles: ");
        int pileSize = scn.nextInt();

        int[] pile = new int[pileSize];

        System.out.println("Enter no. of bananas in each pile:");

        inputBananas(pile);

        System.out.print("Enter total no. of hours: ");
        int totalHours = scn.nextInt();

        System.out.print("The minimum no. of bananas each hour should koko eat: " + rateOfBananas(pile,totalHours));
    }
}
