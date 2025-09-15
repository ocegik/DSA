package SortingAlgorithms;

public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {1, 5, 2, 9, 7};

        System.out.println("Unsorted Array: ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 

        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 

    }
}