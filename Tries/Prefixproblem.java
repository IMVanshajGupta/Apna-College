
public class Prefixproblem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;// new upgrade as we need it

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;// for each new node we can give it freq as 1
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            } else {
                curr.children[indx].freq++;// if indx is present at that node we increase its freq by one
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

    public static void findPrefix(Node root, String ans) {
        if (root == null) {// agar root hi null hojae toh return karjaenge
            return;
        }
        if (root.freq == 1) {// jha pr freq 1 miljaegi wha apna ans print karwa denge and return karjaenge
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {// level wise traversing
            if (root.children[i] != null) {/// agar root ke children ki value null nahi hai toh
                findPrefix(root.children[i], ans + (char) (i + 'a'));// agee badenge or badte rheege
            }
        }

    }

    public static void main(String arg[]) {
        String word[] = { "dog", "duck", "dove", "zebra" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}
