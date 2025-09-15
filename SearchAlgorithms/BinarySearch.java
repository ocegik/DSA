package SearchAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 30;

        int result = binarySearch(arr, 0, arr.length -1 ,target);

        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int target){
        if (low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(target == arr[mid]){
            return mid;
        }
        else if (target < arr[mid]){
            return binarySearch(arr, low, mid - 1 , target);
        }else{
            return binarySearch(arr, mid + 1, high, target);
        }
    }
}
