import java.util.*;

public class LowestCommonAncestor {
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

    // TC-->O(n)
    // yeh getpath fuction is to find the path of given node from the root
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {// root is empty
            return false;
        }
        path.add(root);// agar root empty nahi hai toh obvios woh path ka part hogi as wahi se shuru
                       // hoga sb
        if (root.data == n) {
            return true;// agar woh root hi given node ke barbar hojae toh bas maza hi agya whi pr rukh
                        // jaenge
        }
        boolean foundLeft = getPath(root.left, n, path);// warna left me dekhnge
        boolean foundRight = getPath(root.right, n, path);// right me dekhenge us root ki
        if (foundLeft || foundRight) {
            return true;// agar left or right me kahi miljata hai toh return kardenge
        }
        path.remove(path.size() - 1);// agar nahi milta hai us node ke liyeh toh hum usee apme array me se remove
                                     // karenge
        return false;// agar hum ko kahi bhi nhai milta hai us given node ke liyeh toh hum false
                     // return kardenge

    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();// node 1 ke path ke liye arraylist
        ArrayList<Node> path2 = new ArrayList<>();// node 2 ka path ke liyeh arraylist

        getPath(root, n1, path1);// dono ka path nikala via using getPath function
        getPath(root, n2, path2);
        int i = 0;// arraylist me travel karenge and try to find the point where dono data
                  // differnt ho us array ke
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;// jha pr dono alag value ho wah pr break kardenge
            }
        }
        Node lca = path1.get(i - 1);// jha break hue hai us se phele wali node hi chaiye hume wohi ans hai
        return lca;
    }

    // APPROCH TWO TO FIND THE LCA

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;// agar root node data hi given nodes ki value ke barabar hai toh root node hi
                        // return kardenge
        }
        Node Leftlca = lca2(root.left, n1, n2);// other we check for left and right subtree of it
        Node rightlca = lca2(root.right, n1, n2);

        if (Leftlca == null) {// agar given both nodes left me present hai toh right null hoga
            // or we can say right null hai toh dono nodes left me present hongi
            return rightlca;
        }
        if (rightlca == null) {// same case with it
            return Leftlca;
        }

        return root;// agar given nodes ek left me hai or ek right me j
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;
        System.out.println(lca(root, n1, n2).data);
        System.out.print(lca2(root, n1, n2).data);

    }
}
