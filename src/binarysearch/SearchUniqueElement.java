//WAP to search unique element in twice array
package binarysearch;

public class SearchUniqueElement {

    static int findUnique(int[] arr){

        if(arr.length == 1 || arr[0] != arr[1])
            return arr[0];

        if(arr[arr.length - 1] != arr[arr.length - 2])
            return arr[arr.length - 1];

        int low = 1;
        int high = arr.length - 2;

        while (low <= high){

            int mid = low + ((high - low)/2);

            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];

            if(mid % 2 == 0 && arr[mid] == arr[mid + 1] || mid % 2 != 0 && arr[mid] == arr[mid - 1])
                low = mid + 1;

            else
                high = mid - 1;
            }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};

        int uniqueElement = findUnique(arr);

        if(uniqueElement == -1){
            System.out.print("There is no unique element in the array");
        }
        else{
            System.out.print("The unique element in the array is: " + uniqueElement);
        }
    }
}
