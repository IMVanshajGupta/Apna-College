import java.util.*;

public class RootToLeaf {
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

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "-->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {// base case
            return;
        }
        path.add(root.data);// sabse phele us node ko add karlenge hum apni path arraylist me
        if (root.right == null && root.left == null) {
            printPath(path);// agar leaf pr agaye hai toh print the path
        }
        printRoot2Leaf(root.left, path);// phele left me
        printRoot2Leaf(root.right, path);// phir right me
        path.remove(path.size() - 1);// done with one side remove it via backtracking
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        printRoot2Leaf(root, new ArrayList<>());

    }
}
