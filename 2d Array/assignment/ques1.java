
// package java.2d Array.assignment;
import java.util.*;

public class ques1 {
    public static void times(int matrix[][], int n) {
        int times = 0;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (matrix[i][j] == n) {
                    times+=1;
                }
            }
        }
        System.out.println(times);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        times(matrix, key);
    }
}
