package DataStructures.DArrays;

public class TransposeArray {
    public static void main(String[] args){

        int[][] arr = { {1,2,3},{4,5,6} };

        System.out.println("Array: \n");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] tArray = transposeArray(arr);

        System.out.println("Transposed Array: \n");

        for(int i = 0; i < tArray.length; i++){
            for(int j = 0; j < tArray[0].length; j++){
                System.out.print(tArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] transposeArray(int[][] arr){

        int[][] tArray;
        tArray = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                tArray[i][j] = arr[j][i];
            }
        }
        return tArray;
    }
}
