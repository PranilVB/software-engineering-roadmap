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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return max;
    }
    int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=traverse(root.left);
        int right=traverse(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int sum=(left+right+root.val);
        max=Math.max(max,sum);
        return Math.max(left,right)+root.val;
    }
}