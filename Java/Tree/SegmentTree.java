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
        node.left= this.constructTree(arr, mid+1, end);
        node.data=node.left.data+node.right.data;
        return node;

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
}
