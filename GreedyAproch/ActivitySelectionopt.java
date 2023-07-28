
//in this question end time was sorted for us what in the case if it is not sorted or start time is given sorted 
//for it we store our start end and index in 2D array and perforn activity there accordingly with the help of it
import java.util.*;

public class ActivitySelectionopt {
    public static void main(String arg[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // 2D array
        // three coloumns for start ,end , index
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;// index{after sorting humari index uper niche hojaengi so hume original ka ide
                                 // nahi rhega isliye humne index store karwa di hai original ki }
            activities[i][1] = start[i];// start
            activities[i][2] = end[i];// end
        }
        // lamda function->shortform -->comparigfunction
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));// way to sort 2d array specificaly one thing 3rd
                                                                       // coloumn
        int mxAct = 0;
        ArrayList<Integer> Ans = new ArrayList<>();
        // 1st activity
        mxAct = 1;
        Ans.add(activities[0][0]);// activity ka index
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity selected
                mxAct++;
                Ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities= " + mxAct);
        for (int i = 0; i < Ans.size(); i++) {
            System.out.print("A" + Ans.get(i) + " ");
        }
        System.out.println();
    }
}
// tc-->O(nlogn)