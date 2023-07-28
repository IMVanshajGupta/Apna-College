
public class FloodFillAlgo {
    public void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgcol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcol) {
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc - 1, color, vis, orgcol);
        helper(image, sr, sc + 1, color, vis, orgcol);
        helper(image, sr - 1, sc, color, vis, orgcol);
        helper(image, sr + 1, sc, color, vis, orgcol);
    }

    public int[][] floodfill(int image[][], int sr, int sc, int color) {
        // sr-->starting row
        // sc-->starting column
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String args[]) {

    }
}
