package DataStructures.DArrays;

public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] pMatrix = {{1, 0},{2, 4},{3, 1}};
        int[][] qMatrix = {{2, 3, 4}, {1, 1, 1}};

        System.out.println("Matrix p: ");
        for(int i = 0; i < pMatrix.length; i++){
            for(int j = 0; j < pMatrix[0].length; j++){
                System.out.print(pMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix q: ");
        for(int i = 0; i < qMatrix.length; i++){
            for(int j = 0; j < qMatrix[0].length; j++){
                System.out.print(qMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResult of multiplication: ");
        int[][] mMatrix = matrixMultiplication(pMatrix, qMatrix);
        for(int i = 0; i < mMatrix.length; i++){
            for(int j = 0; j < mMatrix[0].length; j++){
                System.out.print(mMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] pMatrix, int[][] qMatrix){
        if(pMatrix[0].length != qMatrix.length){
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        int[][] mMatrix = new int[pMatrix.length][qMatrix[0].length];

        for(int i = 0; i < pMatrix.length; i++){
            for(int l = 0; l < qMatrix[0].length; l++){
                int sum = 0;
                for(int j = 0; j < pMatrix[0].length; j++){
                    sum += pMatrix[i][j] * qMatrix[j][l];
                }
                mMatrix[i][l] = sum;
            }
        }
        return mMatrix;
    }
}
