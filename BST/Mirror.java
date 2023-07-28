public class Mirror {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node CreateMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMIrror = CreateMirror(root.left);// phele left subtree ko mirror kardenge
        Node rightMirror = CreateMirror(root.right);// thn right subtree ko mirror kardenge

        root.left = rightMirror;// thn we update the left and right of the root node
        root.right = leftMIrror;//

        return root;// and return the root
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String arg[]) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root = CreateMirror(root);
        preorder(root);
    }
}
