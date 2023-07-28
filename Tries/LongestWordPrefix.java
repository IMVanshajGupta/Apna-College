
public class LongestWordPrefix {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int indx = key.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }

    public static String ans = "";// isme ans store karwaenge

    public static void LongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {// comditon to be cheched null nahi hona
                                                                           // chaiyeh and uska eow true hona chaiyeh
                char ch = (char) (i + 'a');// the character at that node
                temp.append(ch);// we add this to our temp ans
                if (temp.length() > ans.length()) {// compare the values of both agar temp ki lenght badi hogi ans se
                                                   // toh hi hum word add karenge warna nahi karenge
                    ans = temp.toString();// adding that character toh the temp
                }
                LongestWord(root.children[i], temp);// recursively callig our fuction
                temp.deleteCharAt(temp.length() - 1);// while returning back we delte the char from out temp so that the
                                                     // value cant repeat again agaijn
            }
        }

    }

    public static void main(String arg[]) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        LongestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
