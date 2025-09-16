package Basics;

public class FindMax {
    public static void main(String[] args){

        int[] arr = {1, 2, 9, 4, 5};
        int max = arr[0];

        max = basicMethod(arr, max);

        System.out.println("The Maximum element in given array is: " + max);

    }

    public static int basicMethod(int[] arr, int max){

        for(int i = 0; i < arr.length; i++){

            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
