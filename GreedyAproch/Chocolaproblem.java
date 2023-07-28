import java.util.*;

public class Chocolaproblem {
    public static void main(String arg[]) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;// horizontal and vertical cuts
        int hp = 1, vp = 1;// horizontal and vertical pieces {initialy we have one in total}
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {// travis karenge har ek elemnt pr dono arrys ke
            if (costVer[v] <= costHor[h]) {// checking kis cut ki cost zada hai
                cost += costHor[h] * vp;// cost bada denge usi acciordig
                hp++;
                h++;
            } else {// for vertical cuts
                cost += costVer[v] * hp;// cost bada denge usi acciordig
                vp++;
                v++;

            }
        }
        // agar tb bhi koi cut bach jata hai toh
        while (h < costHor.length) {
            cost += costHor[h] * vp;// cost bada denge usi acciordig
            hp++;
            h++;

        }
        while (v < costVer.length) {
            cost += costVer[v] * hp;// cost bada denge usi acciordig
            vp++;
            v++;

        }

        System.out.println("min cost of cut = " + cost);
    }
}
