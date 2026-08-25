//WAP to print the transpose of a given matrix
package twodimensionalarrays;

import java.util.Scanner;

public class TransposeMatrix {

    static Scanner scn = new Scanner(System.in);

    static void inputMatrix(int[][] matrix,int rows,int cols){

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                System.out.print("Enter element [" + i + "][" + j +"]: ");
                matrix[i][j] = scn.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix){

        for(int[] rows: matrix){

            for(int ele: rows){

                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void transpose(int[][] matrix,int rows,int cols){

        int[][] transposeMatrix = new int[cols][rows];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter no. of cols: ");
        int cols = scn.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrix:");
        inputMatrix(matrix,rows,cols);
        printMatrix(matrix);

        System.out.println("The transpose of the matrix is:");
        transpose(matrix,rows,cols);

    }
}
