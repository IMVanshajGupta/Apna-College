public class kadanealgo {
    public static void Kadane(int num[]) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
           // if(maxsum==0){
               // if(minsum>)
           // }
        }
        System.out.println("max sum is " + maxsum);
    }

    public static void main(String arg[]) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // subarray(num);
        Kadane(num);
    }

}
