//package java.Trees;

public class SumofNodes {
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

    public static int sumofnodes(Node root) {
        if (root == null) {// NULL POINT MILJAEGA TOH WAH SE RETURN KARWADENGE 0 VALUE KE SATH
            return 0;
        }
        int leftsumofnodes = sumofnodes(root.left);// TRAVIS TOH THE LAST NODE {LEAF} OF THAT TILL IT FIND ITS NODE
        int rightsumofnodes = sumofnodes(root.right);// SAME WITH THIS
        return leftsumofnodes + rightsumofnodes + root.data; // THN LEFT AND RIGHT NODE sum VALUE PARENT NODE KO
                                                             // DEDIJAEGI OR WOH
        // APNE
        // PARENT KO RETURN KARDEGI apne left right ke liyeh solve karke ONE ADD
        // KARKE khudki
    }

    public static void main(String arg[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(sumofnodes(root));
    }
}
