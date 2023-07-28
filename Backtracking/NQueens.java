import java.util.Scanner;

public class NQueens {
    public static boolean IsSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    // yeh code queens ke moves ko check karke unki position decide karne ka hai
    // board me so that woh ekdusre ko uda nah sake

    public static void nQueens(char board[][], int row) {
        // Base code
        // jab row max hojae tohhume huamra board print karwana hai
        if (row == board.length) {
            Printboard(board);// bhai array yah us type ki chizo ko print karwane ka taria alag hota hai
            count++;
            return;
        }

        // ab hum apne baord me har ek row me ek queen ko kese kese place karsakte hai
        // uska CODE
        for (int j = 0; j < board.length; j++) {
            if (IsSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                // jo pichla Q lagaya hai use hatane ke liye
                board[row][j] = 'X';
            }
        }
    }

    // print board
    public static void Printboard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------NXT BOARD ----------");
    }

    static int count = 0;

    public static void main(String arg[]) {
        // CODE TO MAKE A CHESSBOARD OF NxN
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        // ish board ke liyeh hum call karenge ek row me ek queen bithane ke different
        // way wale function ko
        nQueens(board, 0);
        System.out.print("the number of ways to place our queens is = " + count);
    }
}
// time complexity --> O(n!)