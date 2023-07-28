import java.util.Stack;

public class StocksSpan {
    public static void Stockspan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;// span value of first stock is always 1 {woh pheli value hai use se kise
                    // compare karoge }
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];// ek element ko pakdenge and we compare it with other in the stack
            while (!s.isEmpty() && currprice > stocks[s.peek()]) {// us se choti values ko sbko delete karenge
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;// agar sare elements hi chote hai hum sbko pop karte hue staack ko emty
                                // kardenge uske liyeh we do this
            } else {
                int prevhigh = s.peek();// stack me phele jotop pr vlue thi
                span[i] = i - prevhigh;// we use this formula to update values accordingly

            }
            s.push(i);
        }
    }

    public static void main(String arg[]) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        Stockspan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
