//WAP to find sum of diagonal elements of a square matrix

package twodimensionalarrays;
import java.util.Scanner;
public class SumOfDiagonals {

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

    static int calcSum(int[][] matrix,int rows){

        int sum = 0;

        for(int i = 0; i < rows; i++){

            for(int j = i; j <= i; j++){

                sum += matrix[i][j];

            }
        }
        return sum;
    }

    public static void main(String[] args){

        System.out.print("Enter no. of rows: ");
        int rows = scn.nextInt();

        int[][] matrix = new int[rows][rows];

        System.out.println("Enter elements of matrix:");
        inputMatrix(matrix,rows);
        printMatrix(matrix);

        System.out.println("The sum of diagonals of the square matrix is: " + calcSum(matrix,rows));

    }
}
