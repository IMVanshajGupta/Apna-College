public class IsSubtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root, Node SubRoot) {
        if (root == null && SubRoot == null) {
            return true;
        } else if (root == null || SubRoot == null || root.data != SubRoot.data) {
            return false;
        }
        return isIdentical(root.left, SubRoot.left) && isIdentical(root.right, SubRoot.right);
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        } else if (root == null) {
            return false;
        } else if (isIdentical(root, subroot)) {
            return true;
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String arg[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(isSubtree(root, subRoot)); // expected output: true
    }
}
