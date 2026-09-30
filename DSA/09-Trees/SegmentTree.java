public class SegmentTree {
    private static class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;
        public Node(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr,int start,int end){
        if (start==end) {
            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid=(start+end)/2;
        node.left= this.constructTree(arr, start, mid);
        node.right= this.constructTree(arr, mid+1, end);
        node.data=node.left.data+node.right.data;
        return node;

    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        String str="";
        if (node.left!=null) {
            str=str+"range is ["+node.left.start+"-"+node.left.end+"] Data = "+node.left.data+" => ";
        }else{
            str=str+"no left child";
        }
        str=str+"range is ["+node.start+"-"+node.end+"] Data = "+node.data+" <= ";
        if (node.right!=null) {
            str=str+"range is ["+node.right.start+"-"+node.right.end+"] Data = "+node.right.data+" => ";
        }else{
            str=str+"no right child";
        }
        System.out.println(str);
        if (node.left!=null) {
            display(node.left);
        }
        if (node.right!=null) {
            display(node.right);
        }
    }
    public int query(int qsi,int qei){
        return this.query(this.root,qsi, qei);
    }
    private int query(Node node,int qsi,int qei){
        if (qsi<=node.start && qei>=node.end) {
            return node.data;
        }else if (qsi>node.end || qei<node.start) {
            return 0;
        }else{
            return this.query(node.left, qsi, qei)+this.query(node.right, qsi, qei);
        }
    }
    public void update(int index ,int value ){
        this.root.data=update(this.root, index,value);
    }
    private int update(Node node , int index ,int value){
        if (index>=node.start && index<=node.end) {
            if (index==node.start && index==node.end) {
                node.data=value;
                return node.data;
            }else{
                int leftans=update(node.left, index,value);
                int rightans=update(node.right, index,value);
                node.data=leftans+rightans;
                return node.data;
            }
        }
        return node.data;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        SegmentTree tree=new SegmentTree(arr);
        // tree.display();
        System.out.println(tree.query(2, 6));
    }
}
