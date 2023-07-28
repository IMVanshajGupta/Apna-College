
public class CountUniqString {
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

    public static int countNode(Node root) {
        if (root == null) {// agar root hi khali hai toh return 0 for it
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {// as ek node me 26 elements asakte hai toh
            if (root.children != null) {// jah pr root ke children null nahi hai
                count += countNode(root.children[i]);// recursive call
            }
        }
        return count + 1;
    }

    public static void main(String arg[]) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));// making suffix and inserting them
        }
        System.out.print(countNode(root));
    }
}
