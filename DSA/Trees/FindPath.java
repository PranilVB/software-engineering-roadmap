import org.w3c.dom.Node;

public class FindPath {
    boolean path(Node node , int[] arr,int i){
        if (i>=arr.length||node.val!=arr[i]) {
            return false;
        }
        return path(node.left, arr,i++)||(node.right, arr,i++)
    }
}
