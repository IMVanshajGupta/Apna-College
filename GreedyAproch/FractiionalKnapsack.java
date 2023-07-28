import java.util.*;

public class FractiionalKnapsack {
    public static void main(String arg[]) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;// bori ki capacity

        double ratio[][] = new double[value.length][2];// ek 2d array jisme hum index and ratio store karwa rhe honge
        // 0th column-->index; 1st column-->ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;// index
            ratio[i][1] = value[i] / (double) weight[i];// ratio {double isliyeh bcs we dont want ki data miss ho ratio
                                                        // ka}
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));// short kiya humne apni array ko
        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {// short assending order me hua tha hume desseding me chaiye
                                                     // isliyeh reverse chalaya hia loop
                                                     // yeh hume desending order me isliyeh chaiyeh as we want ki kam
                                                     // weight zada value{high ratio} walo ko apni bori me dale phele so
                                                     // humari finalVal max aee
            int idx = (int) ratio[i][0];// indx ko uthaya
            if (capacity >= weight[idx]) {// us index ke weight ko check kiya ki capacity se kam hai kya
                finalVal += value[idx];// agar kam hai weight toh uski full vlue finalval me store karwadenge
                capacity -= weight[idx];// utna weightcapacity me se minus kardenge
            } else {// ek time pr weight capacity se zada hogya agar toh hum uska kuch part lege as
                    // per our capacity
                finalVal += (ratio[i][1] * capacity);// ratio*capacity
                capacity = 0;// ab capacity khatam bori puri bhar gai
                break;
            }
        }
        System.out.println("final valuue is :- " + finalVal);// printout our final value

    }

}
