import java.util.*;

public class MajorityElement {
    public static void main(String arg[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // int num = arr[i];
            // if (hm.containsKey(num)) {
            // hm.put(num, hm.get(num) + 1);
            // } else {
            // hm.put(num, 1);
            // }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            // hashmap me put karo arr[i] agar arr[i] exist krta hai toh arr[i] ki jo value
            // hai wohi daldo agar nahi karta hai toh yeh default value 0 daldo

            // as we added one in last means
            // agar exist karta hoga toh 1 se increase karjaegaa
            // agar nahi karta hoga toh 1 value usko assign hojaegi
        }
        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }

}
