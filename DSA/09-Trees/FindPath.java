import org.w3c.dom.Node;

public class FindPath {
    boolean path(Node node , int[] arr,int i){
        if (i>=arr.length||node.val!=arr[i]) {
            return false;
        }
        if (node.left==null&&node.right==null&&i==arr.length-1) {
            return true;
        }
        return path(node.left, arr,i++)||(node.right, arr,i++)
    }
}
