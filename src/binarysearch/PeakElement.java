/*WAP to find peak element in a given array
    peak element -- an element which greater than its previous and subsequent element*/
package binarysearch;

public class PeakElement {

    static int findPeak(int[] arr){

        if(arr.length == 1 || arr[0] > arr[1])
            return arr[0];
        if(arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1] ;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(arr[mid] > arr [mid - 1] && arr[mid] > arr[mid + 1])
                return arr[mid];

            if(arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,5,1};

        System.out.print("The peak element in the given array is: " + findPeak(arr));
    }
}
