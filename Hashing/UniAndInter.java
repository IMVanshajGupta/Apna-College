import java.util.HashSet;

public class UniAndInter {
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs.size();
    }

    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                hs.remove(arr2[i]);
            }
        }
        return count;
    }

    public static void main(String arg[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        System.out.println("uninon of arrays= " + union(arr1, arr2));
        System.out.print("intersection of both arrays= " + intersection(arr1, arr2));

    }

}
