import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public TreeNode FindSuccessor(Node root,int target) {
    if(root==null){
        return null;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
            TreeNode currNode=queue.poll();
            if (currNode.left!=null) {
                queue.offer(currNode.left)
            }
            if (currNode.right!=null) {
                queue.offer(currNode.right)
            }
            if (currNode.val==key) {
                if (queue.poll()!=null) {
                    return queue.poll();
                }else{return null;}
            }
    }return null;
}
