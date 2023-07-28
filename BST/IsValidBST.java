
public class IsValidBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
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

    public static boolean isvalidbst(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        if (isvalidbst(root, null, null)) {
            System.out.print("valid BST");
        } else {
            System.out.print("not valid BST");

        }

    }
}
