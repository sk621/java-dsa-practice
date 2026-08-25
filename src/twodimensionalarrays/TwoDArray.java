//WAP to take input and print two-d arrays (matrix)

package twodimensionalarrays;

import java.util.Scanner;

public class TwoDArray {

    static Scanner scn = new Scanner(System.in);

    static void inputArray(int[][] arr,int rows,int cols){

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = scn.nextInt();

            }
        }

    }


    static void printArray(int[][] matrix){

        System.out.println("The matrix formed is:");
        System.out.print("(  ");

        for(int[] rows: matrix){

            for(int ele: rows){

                System.out.print(ele + " ");
            }
            System.out.print(" ");
        }
        System.out.print(")");
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        System.out.print("Enter no. of columns: ");
        int cols = scn.nextInt();

        int[][] matrix = new int[rows][cols];

        inputArray(matrix,rows,cols);

        printArray(matrix);

    }
}
