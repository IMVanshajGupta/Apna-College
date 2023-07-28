import java.util.*;

public class Tickets {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        // this loop is like tickets ke key set me se keys kivalue le kar key me dalenge
        // thn revmap me key ki place pr un keysvalues ko dalenge and value ki place pr
        // key dalenge
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        // ek esi key jo tickets ke key set me toh present ho but revmap me exist nahi
        // karti ho usko return kardenge
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String arg[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);// startig point miljaega
        System.out.print(start);// starting point print kardiya
        for (String key : tickets.keySet()) {// yeh loop chalta rhega till the length of elements in the tickets hashmap
            System.out.print(" --> " + tickets.get(start));// yeh humko from se too tak lekar jaega
            start = tickets.get(start);// start ko update kardiya
        }
        System.out.println();
    }
}
