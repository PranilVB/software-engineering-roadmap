import javax.swing.tree.TreeNode;

public class IsValidBST {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     Integer val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(Integer val) { this.val = val; }
 *     TreeNode(Integer val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return  check(root,null,null);       
    }
    public boolean check(TreeNode node,Integer low,Integer high){
        if(node==null){
            return true;
        }
        if(low!=null && low>=node.val){
            return false;
        }
        if(high!=null && high <=node.val){
            return false;
        }
        boolean left=check(node.left,low,node.val);
        boolean right=check(node.right,node.val,high);
        return left&& right;
    }
}
}
