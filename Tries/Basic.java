
public class Basic {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;// sari nodes array ko null kardiya
            }
        }
    }

    public static Node root = new Node();// root of the trie is always empty

    public static void insert(String word) {
        Node curr = root;// start karenge root node se
        for (int level = 0; level < word.length(); level++) {// level wise travis karenge
            int indx = word.charAt(level) - 'a';// pehele humne us word ki indx define ki
            if (curr.children[indx] == null) {// agar humare array me us indx pr null hai
                curr.children[indx] = new Node();// ek new node bana denge to store that element
            }
            curr = curr.children[indx];// curr ko update kardenge root se now on this node or indx
        }
        curr.eow = true;// jha pr wordend hoga wah eow become true
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

    public static void main(String arg[]) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
