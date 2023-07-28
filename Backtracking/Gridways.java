import java.util.*;

public class Gridways {
    public static int gridway(int i, int j, int row, int col) {
        // base case
        if (i == row - 1 && j == col - 1) {
            return 1;
        } else if (i == row || j == col) {
            // agar boundary ke bhar ja rhe ho toh uske liyeh
            return 0;
        }

        // kaam
        int w1 = gridway(i + 1, j, row, col);//down
        int w2 = gridway(i, j + 1, row, col);//right
        return w1 + w2;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.print(gridway(0, 0, row, col));
    }
}
// time complexity is O(2^(n+m));
// we can see its a grid type something
// we are taking decision t every step to go right or left
// means each block have 2 options
// each block is to be travis soo its 2 options for n+m times
// making its time complexity O(2^(n+m))