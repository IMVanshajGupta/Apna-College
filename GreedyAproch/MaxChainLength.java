import java.util.Arrays;
import java.util.Comparator;

public class MaxChainLength {
    public static void main(String arg[]) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };// pairs agyee
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));// end time ko sort kardiya pairs ke
        int chainLen = 1;// first wala elemnet leliya sort karwane ke bad
        int chaiEnd = pairs[0][1];// us pair ka end store karliya for comaprison
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] >= chaiEnd) {// compair karenge nxt pair ke start ke sath so apne pichle end ko
                chainLen++;// agar condition fullfill hoti hai toh use chainlength ko update kardenge
                chaiEnd = pairs[i][1];// again apne chainend ko update kardenge with the end of of selected pair
                // jis se hum pirse compare kar pae for the nxt pair
            }
        }
        System.out.print("max length of chain = " + chainLen);
    }
}
// tc-->O(nlogn)