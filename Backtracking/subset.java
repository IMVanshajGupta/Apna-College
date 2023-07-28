//going to find the subsets by using recursion and backtracking technique
public class subset {
    public static void Findsubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);     
            }
            return;//base case me return karna important hai warna code will show error
        }
        // YES CASE
        Findsubset(str, ans + str.charAt(i), i + 1);
        // NO CASE
        Findsubset(str, ans, i + 1);
    }

    public static void main(String arg[]) {
        String str = "abc";
        Findsubset(str, "", 0);
    }

}
//TIME COMPLEXITY is O(n*2^n)
//SPACE COMPLEXITY is O(n)

//har element ki ha yah nah ki choice hai use ana hai yah nahi
//once a base case hit hum wapas ajaenge