/* subarray ke liyeh 3for loop chalae;
ek loop start digit set karega
ek loop end digit set karega
ek loop un dono ke bich ka sb print karwadega including thm

for max
largest wala way hi apnaenge;
ek variable ko min valuese initialize kardenge 
and thn compare karenge

global variable and local variable pr dhyan dena kaka 
*/
public class SubArray {

    public static void subarray(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = i; j < num.length; j++) {
                sum = 0;

                for (int k = i; k <= j; k++) {

                    System.out.print(num[k] + " ");
                    sum = sum + num[k];

                }
                if (maxsum < sum) {
                    maxsum = sum;
                }
                System.out.print(" sum of this array : " + sum);
                System.out.println(); // iskiwajhse line change ho rhi hai

            }
            System.out.println("max sum of these subarray is " + maxsum);
            System.out.println(); // jo black khali space arhi hai iski wajh se arhi hai
        }

    }
    // prefix method to find the max of subarray

    public static void prefix(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[num.length];// creating a new array of our array length
        prefix[0] = num[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // store the cumilstive sum of num[]array in prefix[]array
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // this formula works belive me i dry run it!
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum :- " + maxsum);
    }

    public static void main(String arg[]) {
        int num[] = { 1, -4, 8, 9, -5 };
        subarray(num);
        // prefix(num);
    }
}
