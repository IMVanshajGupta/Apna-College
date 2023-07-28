public class ShortPath {
    public static float shortpath(String direction) {
        int n = direction.length();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char dir = direction.charAt(i);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            }
        }
        int z = (x * x) + (y * y);
        float shortlen = (float) Math.sqrt(z);
        return shortlen;
    }
    public static void main(String arg []){
        String dir="WNEENESENNN";
        System.out.println(shortpath(dir));
    }
}
