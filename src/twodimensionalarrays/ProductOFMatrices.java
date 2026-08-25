//WAP to find product matrix for given two matrices
package twodimensionalarrays;

import java.util.Scanner;

public class ProductOFMatrices {

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
            System.out.println();
        }
    }

    static int[][] findProduct(int[][] matrix1,int[][] matrix2,int rows,int cols,int cols2){

        int[][] productMatrix = new int[rows][cols2];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols2; j++){

                for(int k = 0; k < cols; k ++){

                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }
        }
        return productMatrix;
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter no. of column for matrix1: ");
        int cols = scn.nextInt();

//        rows for matrix2
        int rows2 = cols;

        System.out.print("Enter no. of column for matrix2: ");
        int cols2 = scn.nextInt();

        int[][] matrix1 = new int[rows][cols];

        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter elements of matrix1:");
        inputMatrix(matrix1,rows,cols);

        System.out.println("The elements of matrix1:");
        printMatrix(matrix1);

        System.out.println("Enter elements of matrix2:");
        inputMatrix(matrix2,rows2,cols2);

        System.out.println("The elements of matrix2:");
        printMatrix(matrix2);

        System.out.println("The product matrix is:");
        int[][] productMatrix = findProduct(matrix1,matrix2,rows,cols,cols2);
        printMatrix(productMatrix);

    }
}
