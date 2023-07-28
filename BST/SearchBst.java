
public class SearchBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {// agar root node khali hai toh pheli value ko hi hum apni root node bana denge
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if (search(root, 8)) {
            System.out.print("founded");
        } else {
            System.out.print("not founded");

        }
    }
}
