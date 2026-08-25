//WAP to transpose the given square matrix without using extra matrix
package twodimensionalarrays;

import java.util.Scanner;

public class SquareMatrixTranspose {

    static Scanner scn = new Scanner(System.in);

    static void inputMatrix(int[][] matrix,int rows){

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < rows; j++){

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

    static void transpose(int[][] matrix,int rows){

        for(int i = 0; i < rows; i++){

            for(int j = i; j < rows; j++){

                if(i != j){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        int[][] matrix = new int[rows][rows];

        System.out.println("Enter elements of matrix:");
        inputMatrix(matrix,rows);
        printMatrix(matrix);

        System.out.println("The transpose of the matrix is:");
        transpose(matrix,rows);
        printMatrix(matrix);

    }
}
