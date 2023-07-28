//package java.2d Array;

public class Spiral {
    public static void spiral(int matrix[][]) {
        int staRow = 0;
        int staCol = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;
        while (staCol <= endCol && staRow <= endRow) {
            // top
            for (int j = staCol; j <= endCol; j++) {
                System.out.print(matrix[staRow][j] + " ");
            }
            // right
            for (int i = staRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= staCol; j--) {
                if (staRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i > staRow; i--) {
                if (staCol == endCol) { // for odd number of row or coloumn;we dont want to print a same block
                    break;
                }
                System.out.print(matrix[i][staCol] + " ");
            }
            staRow++;
            staCol++;
            endCol--;
            endRow--;

        }
    }

    public static void main(String arg[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiral(matrix);
    }
}
