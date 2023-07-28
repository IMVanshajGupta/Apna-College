
//package java.Arraylist;
import java.util.*;

public class multidimension {
    public static void main(String arg[]) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();// arraylist ke andar ek or arraylist banai hai
                                                                   // mainlist
        ArrayList<Integer> list = new ArrayList<>(); // making arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        mainlist.add(list);// added our list to mainlist

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2);

        System.out.print(mainlist);// main list ke andar list and list2 present hai
        System.out.println();

        // main list ke andar list and list2 present hai

        for (int i = 0; i < mainlist.size(); i++) { // mainlist ki list pr jaenge ek ek karke
            ArrayList<Integer> currlist = mainlist.get(i); // un sb ko currlist me add karte jaenge
            for (int j = 0; j < currlist.size(); j++) { // thn woh elemnet print karwadenge
                System.out.print(currlist.get(j) + " ");
            }
        }
        // mainlist---->lists----->elements
    }

}
