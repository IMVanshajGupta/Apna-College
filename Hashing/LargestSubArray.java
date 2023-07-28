import java.util.*;;

public class LargestSubArray {
    public static void main(String arg[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };

        HashMap<Integer, Integer> map = new HashMap<>();

        // sum,indx
        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {// agar reapeated key miljati hai toh
                len = Math.max(len, j - map.get(sum));// compare karenge prev len or ish new length me se konsi badi hai
            } else {
                map.put(sum, j);// map me sum ko store karte jaenge uske index ke sath
            }
        }
        System.out.print("largest subarray whose sum is 0 => " + len);
    }
}
