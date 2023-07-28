
public class LargestBstInBT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    // ek info class banaege jis me store karwaenge info of the given bt;
    static class Info {
        boolean IsBST;// bst hai yah nahi uska woh part
        int size;// hai toh size kya hai uska
        int min;// min node of that bt
        int max;// max node of that bt {for checking isValid cond we need this info}

        public Info(boolean IsBST, int size, int min, int max) {
            this.IsBST = IsBST;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    public static int maxBSt = 0;// initialize it with 0 as we update it with the biggest

    public static Info largestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);// phele hum left ki info le aenge
        Info rightInfo = largestBst(root.right);// thn right ki info le aenge
        int size = leftInfo.size + rightInfo.size + 1;// left subtree ka size plus right subtree ka size plus that root
                                                      // node
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));// min value is left right and node me se
                                                                             // min value
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));// max valueis left right and node me se
                                                                             // max value
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {// isValid vali cond
            return new Info(false, size, min, max);
        }

        if (leftInfo.IsBST && rightInfo.IsBST) {// agar dono taraf se bst ban rha hai toh woh part bst hai
            maxBSt = Math.max(maxBSt, size);// so hum maxbst ko update kardenge us bst ke size se
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);// agar kuch nahi toh yeh
    }

    public static void main(String args[]) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBst(root);
        System.out.println("max bst in the bt is of size :- " + maxBSt);

    }
}
