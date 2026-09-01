import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class BT-RightSideView {
    class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        if (root==null) {
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for (int i = 0; i < levelSize; i++) {
                
                if (i<levelSize-1) {
                    TreeNode curr=queue.poll();
                    if (curr.left!=null) {
                    queue.offer(curr.left);
                }
                if (curr.right!=null) {
                    queue.offer(curr.right);
                }
                }else{
                    TreeNode curr=queue.poll();
                    result.add(curr.val);
                    if (curr.left!=null) {
                    queue.offer(curr.left);
                }
                if (curr.right!=null) {
                    queue.offer(curr.right);
                }
                }
            }
        }return result;
    }
}
}
