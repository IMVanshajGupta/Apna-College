
// first dsa code !
// package raintrapprblm;
// import java.util.*;

public class RainTrap {
    public static int raintrap(int height[]) {
        // calculation of leftmax
        int n = height.length;
        int leftMax[] = new int[n];// array which stores max from the left
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculation of rightmax
        int rightMax[] = new int[n];// array which stores max from the right
        rightMax[n - 1] = height[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // calculation of waterlevel
        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapedwater += waterlevel - height[i];
        } // samgh gye!
          // water level depend kis pr kar rha hoga wah pr jo min value hogi uspr;
          // phele hum us index pr left and right side se max nikal lenge thn chech for
          // min value
        return trapedwater;
    }

    public static void main(String arg[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(raintrap(height));

    }
}
