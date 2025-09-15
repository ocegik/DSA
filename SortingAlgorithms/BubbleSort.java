package SortingAlgorithms;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 4, 2};
        
        System.out.println("Unsorted Array: ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 

        for (int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 

    }
}