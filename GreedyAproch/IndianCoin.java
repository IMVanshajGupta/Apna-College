import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String arg[]) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coin, Comparator.reverseOrder());
        int amount = 590;
        int coinCount = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                while (amount >= coin[i]) {
                    coinCount++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }

        }
        System.out.println("coins (min) used in this amount is " + coinCount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
