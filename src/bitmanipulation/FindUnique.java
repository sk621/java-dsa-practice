//WAP to print unique number given in an array where all other elements repeated twice
package bitmanipulation;

public class FindUnique {

    static int findUnique(int[] arr){

        int xor = 0;

        for(int ele: arr){

            xor ^= ele;
        }
        return xor;
    }

    public static void main(String[] args){

        int[] arr = {1,0,5,2,5,3,3,1,2};

        System.out.print("The unique number in the array is: " + findUnique(arr));


    }

}
