import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//package java.Arraylist;

public class PairSum {
    public static int pairsum(ArrayList<Integer> list, int target) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // optimised
    public static boolean pairsumopt(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        // int sum = list.get(lp) + list.get(rp);
        Collections.sort(list);
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }
            if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    // this is for sorted and rotated list over a pivot point
    // first we find that pivot point
    // thn use same algo as but but here we use modular airthmatic to rotate in the
    // array left & right
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;// breaking point
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;// we get our breaking point
            }
            break;
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }
            if (sum > target) {
                rp = (n + rp - 1) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }
        return false;

    }

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(pairsum(list, 5));
        System.out.println(pairsumopt(list, 1));

    }
}
