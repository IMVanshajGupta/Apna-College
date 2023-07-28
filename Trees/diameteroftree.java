//import java.util.*;;

public class diameteroftree {
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

    // APPROCH 1
    // ----------------------------------------------------------------------------->
    public static int Height(Node root) {
        if (root == null) {// NULL POINT MILJAEGA TOH WAH SE RETURN KARWADENGE 0 VALUE KE SATH
            return 0;
        }
        int lh = Height(root.left);// TRAVIS TO THE LAST NODE {LEAF} OF THAT TILL IT FIND ITS Null thn it return 0
        int rh = Height(root.right);// SAME WITH THIS
        return Math.max(lh, rh) + 1; // THN LEFT AND RIGHT NODE ME SE MAX VALUE PARENT NODE KO DEDIJAEGI OR WOH APNE
                                     // PARENT KO RETURN KARDEGI ONE ADD KARKE

    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdiam = diameter(root.left);
        int leftHt = Height(root.left);
        int rightdiam = diameter(root.right);
        int rightHt = Height(root.right);

        int selfdiam = leftHt + rightHt + 1;
        return Math.max(rightdiam, Math.max(leftdiam, selfdiam));

    }

    // APROCH 2
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

        public static Info diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftinfo = diameter2(root.left);
            Info righInfo = diameter2(root.right);
            int diam = Math.max(leftinfo.diam, Math.max(righInfo.diam, leftinfo.ht + righInfo.ht + 1));
            int ht = Math.max(leftinfo.ht, righInfo.ht) + 1;
            return new Info(diam, ht);
        }
    }

    public static void main(String arg[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Height(root));
        System.out.println(diameter(root));
        System.out.print(Info.diameter2(root).diam);// agar koi new class banao toh uske dot(.) me aenge uske andar ke
                                                    // function

    }

}
