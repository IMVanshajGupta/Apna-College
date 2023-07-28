import java.util.*;

public class Basic {
    public static void main(String arg[]) {
        // hashmap-------------------------------------------------------->
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("india", 150);
        // hm.put("china", 200);
        // hm.put("bangladesh", 30);
        // hm.put("indonesia", 20);
        // System.out.println(hm + " ");

        // int population = hm.get("india");
        // System.out.println(population);
        // System.out.println(hm.containsKey("india"));// true
        // System.out.println(hm.containsKey("africa"));// false
        // System.out.println(hm.remove("china"));// remove that element also give its
        // value
        // System.out.println(hm);

        // Set<String> keys = hm.keySet();
        // System.out.println(keys);
        // for (String k : keys) {
        // System.out.println("key=" + k + ",value=" + hm.get(k));
        // }
        // hashsets-------------------------------------------------------------->
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("benglore");
        cities.add("noida");
        cities.add("dubai");
        cities.add("uttarpradesh");
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        for (String city : cities) {
            System.out.println(city);

        }

    }

}

