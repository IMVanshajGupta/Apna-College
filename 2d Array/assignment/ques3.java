//package java.2d Array.assignment;

public class ques3 {
    public static void transpose(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;
        int transmatrix[][] = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transmatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(transmatrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void printMatrix(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        printMatrix(matrix);
        System.out.println();
        transpose(matrix);
    }
}