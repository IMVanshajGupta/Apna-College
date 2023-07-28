
// package java.2d Array.assignment;
import java.util.*;

public class ques2 {
    public static void rowsum(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("of which row you want to find the sum");
        int row = sc.nextInt();
        int col = matrix[0].length - 1;
        for (int j = 0; j <= col; j++) {
            sum += matrix[row-1][j];

        }
        System.out.println(sum);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        rowsum(matrix);
    }
}