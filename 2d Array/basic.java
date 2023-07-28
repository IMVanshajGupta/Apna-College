
// package java.2d Array;
import java.util.*;

public class basic {

    public static void Matrix(int num[]) {
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("write the number of rows :-");
        int row = sc.nextInt();
        System.out.println("write the number of columns::-");
        int col = sc.nextInt();
        System.out.println("Write the elemnts of matrix");
        int matrix[][] = new int[row][col];
        // taking inputs of 2d
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // giving output ofthe 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // int curelement = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largestst number of this matrix is :-");
        System.out.print(largest);

    }

    public static void main(String arg[]) {
        Matrix(null);
    }

}
