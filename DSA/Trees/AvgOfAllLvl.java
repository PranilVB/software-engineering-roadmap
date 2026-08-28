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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> avg=new ArrayList<>();
    if(root==null){
    return avg;
    }
    Queue<TreeNode>queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
    int lvSize=queue.size();
    int[] arr=new int[lvSize];
    for(int i=0;i<lvSize;i++){
    TreeNode curr=queue.poll();
    arr[i]=curr.val;
    if (curr.left!=null) {
    queue.offer(curr.left);
    }
    if (curr.right!=null) {
    queue.offer(curr.right);
    }

    } double sum=0;
    for(int i=0;i<lvSize;i++){
    sum+=arr[i];
    }
    double avgerage=sum/lvSize;
    avg.add(avgerage);
    }
    return avg;
    }
    }
    