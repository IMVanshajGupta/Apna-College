public class Transformation {
    static class Node {// har bar banana padega yeh jb bhi nodes aengi
        // YAAD KARLENA YEH
        int data;
        Node left;
        Node right;

        Node(int data) {// work of these
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int transformation(Node root) {
        if (root == null) {
            return 0;
        }

        int leftchild = transformation(root.left);// left me jate rhenge till return with the base case from bottom
        int rightchild = transformation(root.right);// right me jate rhenge till return with the base case from bottom
        int data = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        root.data = newleft + leftchild + newright + rightchild;// updation of that node

        return data;// we return the nodes value to uper node

    }

    // for printint the values of the tree
    // PREORDER
    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transformation(root);
        Preorder(root);

    }

}
