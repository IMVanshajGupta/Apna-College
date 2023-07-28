

public class tiling {
    public static int totalways(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        // vertical me jate hi base se 1 space kam hojaegi and we reapet karke check kar
        // rhe hai
        int vert = totalways(n - 1);

        // horizontal
        // same horizontal me dalte hi base se 2 sace kam hojaegi and we checking it for
        // n-2 remaing space
        int hori = totalways(n - 2);
        // total ways toh sum hoga donotarike se lagane ka
        return vert + hori;
    }

    public static void main(String arg[]) {
        System.out.println(totalways(9));
    }

}
