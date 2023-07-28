
//package java.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Basicprblms {
    public static void reverse(ArrayList<Integer> list) {

        // print elements in reverse order

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void max(ArrayList<Integer> list) {

        // find the maximum

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);

    }

    public static void main(String arg[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

        max(list);
        Collections.sort(list, Collections.reverseOrder());//prits our Arraylist in reverse order. 
        System.out.println(list);
    }
}
