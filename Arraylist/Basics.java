
//package java.Arraylist;
import java.util.ArrayList;

//import java.util.*;
public class Basics {
    public static void main(String arg[]) {
        // syntax of a Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Float> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // opertations of a Arraylist

        // 1) add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // there is another way to add an element to our index
        // by which we can add an element to a particular index
        // us index pr element chala jaega baki sb apni position se khisak jaenge
        list.add(1, 8);

        // get element
        int element = list.get(2);
        System.out.println(element);

        // delete an elements
        list.remove(2);
        System.out.println(list);

        // set element
        list.set(2, 10);
        // us index pr jakar new value store karwa dega purani ko remove karke
        System.out.println(list);

        // contains
        // check is that element present or not
        // return values true or false accordingly
        System.out.println(list.contains(1));
        System.out.println(list.contains(9));

        // size of a list
        // it is a inbuilt function or method of arraylist library
        System.out.println(list.size());

        // we can also use it to print our all elements
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
       

    }

}
