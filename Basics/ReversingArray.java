package Basics;

public class ReversingArray {

    public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println("Array: ");

    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    } 

    for(int i = 0; i < (arr.length)/2 ; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }

    System.out.println(" Reversed Array: ");
    
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    } 
    }
}
