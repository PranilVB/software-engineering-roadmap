import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class CousinsInBt {
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
    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();

            TreeNode parentX = null;
            TreeNode parentY = null;

            for (int i = 0; i < levelSize; i++) {

                TreeNode curr = queue.poll();

                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {
                        return false;
                    }
                }

                if (curr.left != null && curr.left.val == x) {
                    parentX = curr;
                }

                if (curr.right != null && curr.right.val == x) {
                    parentX = curr;
                }

                if (curr.left != null && curr.left.val == y) {
                    parentY = curr;
                }

                if (curr.right != null && curr.right.val == y) {
                    parentY = curr;
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            if (parentX != null && parentY != null) {
                return parentX != parentY;
            }

            if (parentX != null || parentY != null) {
                return false;
            }
        }

        return false;
    }
}
}
