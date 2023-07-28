
//package java.GreedyAproch;
import java.util.*;

public class ActivitySelection {
    public static void main(String arg[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };// activity start time
        int end[] = { 2, 4, 6, 7, 9, 9 };// activity end time
        // end time basis sorted {end time humara sorted hai}
        int mxAct = 0;// initialize our activity count with zero
        ArrayList<Integer> Ans = new ArrayList<>();
        // 1st activity
        mxAct = 1;// update our activity count as we always consider the first activity
        Ans.add(0);// added 0th activity to our ans array{our first activity}
        int lastEnd = end[0];// storing endtime of previous activity
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {// coundition not to overlap
                // activity selected
                mxAct++;// activity count updated
                Ans.add(i);// store the number which pass the condition
                lastEnd = end[i];// update our lastend with the activity selected
            }
        }
        System.out.println("max activities= " + mxAct);
        for (int i = 0; i < Ans.size(); i++) {
            System.out.print("A" + Ans.get(i) + " ");
        }
        System.out.println();
    }
}
// tc-->O(n)