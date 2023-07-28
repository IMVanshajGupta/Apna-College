
//package java.2d Array;

public class Diagonalsum {
    public static void optdiagonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void diagonalsum(int matrix[][]) {
        int sum = 0;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        if (row != col) {
            System.out.print("can calculate only for square matrix");
        } else {
            for (int i = 0; i <= row; i++) {
                for (int j = 0; j <= col; j++) {
                    if (i == j || i + j == row) {// ek sidhe diagonal {\}ke liyeh hai dusri for the the other side
                                                 // diagonal {/}
                        sum += matrix[i][j];
                    }
                }
            } 
        }
        System.out.println(sum);
    }

    public static void main(String arg[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonalsum(matrix);
        optdiagonalsum(matrix);
    }

}
