import javax.swing.tree.TreeNode;

public class DiameterOfBt {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int LeftHeight=height(node.left);
        int RightHeight=height(node.right);
        int dia=LeftHeight+RightHeight+1;
        diameter=Math.max(dia,diameter);
        return Math.max(LeftHeight,RightHeight)+1;
    }
}
}
