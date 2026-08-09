//WAP to check how many times an array is rotated
package binarysearch;

public class NumberOfRotation {

//    static int countRotation(int[] arr){
//
//        int count = -1;
//        int low = 0;
//        int high = arr.length-1;
//        int min = Integer.MAX_VALUE;
//
//        while(low <= high){
//
//            int mid = ((low + high - low)/2);
//
//            if(arr[mid] < min){
//                min = arr[mid];
//                count = mid;
//            }
//            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
//                low++;
//                high--;
//            }
//            else if(arr[low] <= arr[mid]){
//                if(arr[low] <= min) {
//                    min = arr[low];
//                    count = low;
//                }
//                    low = mid + 1;
//            }
//            else {
//                high = mid - 1;
//                if(arr[mid] <= min){
//                    min = arr[mid];
//                }
//            }
//        }
//        System.out.println(min);
//        return count;
//    }
static int countRotation(int[] arr){

    int low = 0;
    int high = arr.length-1;
    int min = Integer.MAX_VALUE;
    int count = -1;

    while(low <= high) {

        int mid = low + ((high - low) / 2);

        if (arr[mid] < min) {
            min = arr[mid];
            count = mid;
        }
//            check for duplicate values
        if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
            low++;
            high--;
        }
//            check for left sorted part
        else if (arr[low] <= arr[mid]) {
            if (arr[low] <= min) {
                min = arr[low];
                count = low;
            }
            low = mid + 1;             // also check for right unsorted part
        }
//            check for right unsorted part
        else {
            high = mid - 1;
            if(arr[mid] <= min){
                min = arr[mid];
                count = mid;
            }
        }
    }
    System.out.println(min);
    return count;
}

    public static void main (String[] args){

        int[] arr = {7,8,9,1,2,3,4,5,6};

        System.out.print("The number of times an array is rotated is: " + countRotation(arr));

    }
}
