//WAP to add two given matrices

package twodimensionalarrays;

import java.util.Scanner;

public class AdditionOfMatrices {

    static Scanner scn = new Scanner(System.in);

    static void inputMatrix(int[][] matrix,int rows,int cols){

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scn.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix){

        for(int[] rows: matrix){

            for(int ele: rows){

                System.out.print(ele + " ");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    static int[][] sumMatrix(int[][] matrix1,int[][] matrix2,int rows,int cols){

        int[][] sumMatrix = new int[rows][cols];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter no. of cols: ");
        int cols = scn.nextInt();

        int[][] matrix1 = new int[rows][cols];

        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of matrix1:");
        inputMatrix(matrix1,rows,cols);

        System.out.println("The elements of matrix1:");
        printMatrix(matrix1);

        System.out.println("Enter elements of matrix2:");
        inputMatrix(matrix2,rows,cols);

        System.out.println("The elements of matrix2:");
        printMatrix(matrix2);

        System.out.println("The sum matrix is:");
        int[][] sumMatrix = sumMatrix(matrix1,matrix2,rows,cols);
        printMatrix(sumMatrix);

    }
}
