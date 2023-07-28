import java.util.*;;

public class preorder {
    // phele ek node class banaenge
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {// work of these {constructor}
            this.data = data;
            this.left = null;// yeh.left karenge toh yeh wali chiz store hojaegi or show karega
            this.right = null;
        }
    }

    // ek or class banaenge
    static class Binarytree {
        static int idx = -1;

        // a function
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {// agar -1 hai value node ki toh wah pr kuch nahi karna
                return null;
            }
            Node newNode = new Node(nodes[idx]);// nai node banai jiski value hogi array me us index pr present number
                                                // ke barabar

            newNode.left = buildTree(nodes);// left node buildtree function ko call karega or ek node banadega left me
                                            // humari new node ke agr use -1 mil jata hai toh age bad jaega right node
                                            // form karega

            newNode.right = buildTree(nodes);// right node
            // left nodes fill karne ke bad right nodes pr aega
            return newNode;
        }
    }

    // preorder
    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    // inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    // postorder
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    // levelorder
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();// we created a queue
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String arg[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();// ek new binary tree banaya jiska nam hai "tree"
        Node root = tree.buildTree(nodes);// ek node jiska nam root hai storing the value of first node
        System.out.println(root.data);// print the data of node which is left of root
        System.out.println(root.left.data);// print the data of node which is left of root
        System.out.println(root.right.data);// print the data of node which is right of root
        System.out.println(root.left.left.data);// print the data of node which is left of left of root
        System.out.println(root.left.right.data);// print the data of node which is right of left of root
        // System.out.println(root.right.left.data);// print the data of node which is
        // left of right of root
        Preorder(root);// buildtree ek binary tree bna dena hai nodes se jiska nam tree hai
        // root is the
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);

    }
}
// ho kya rha hai
// humne phele ARRAY ke form me numbers diyeh NODES nam se
// we made a new binarytree TREE nam se
// we made a NODE name ROOT which store the value of nodes of our tree pass
// buildtree function for our array nodes

// Tc--->O(n)