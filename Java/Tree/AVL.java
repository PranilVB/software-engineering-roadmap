public class AVL {
        public class Node {

        private int value;
        private int height;

        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {

        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left)-height(node.right)>1){
            if(height(node.left.left)>height(node.left.right)){
                return rightRotate(node);
            }else{
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if(height(node.left)-height(node.right)<-1){
            if(height(node.right.right)>height(node.right.left)){
                return leftRotate(node);
            }else{
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }

        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height=Math.max(height(c.left), height(c.right)+1);
        return c;

    }
    private Node leftRotate(Node p) {
        Node c=p.right;
        Node t=c.right;
        c.left=p;
        p.right=t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height=Math.max(height(c.left), height(c.right)+1);
        return c;

    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }
public static void main(String[] args) {
    AVL tree=new AVL();
    for(int i=0;i<1000;i++){
        tree.insert(i);
    }
    System.out.println(tree.height(tree.root));
}
}
