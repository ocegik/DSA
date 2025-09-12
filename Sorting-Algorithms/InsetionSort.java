public class InsetionSort {
    public static void main(String[] args){

        int[] arr = {1, 5, 9, 3, 6};

        System.out.println("Unsorted Array: ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted Array: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 
    }
}
