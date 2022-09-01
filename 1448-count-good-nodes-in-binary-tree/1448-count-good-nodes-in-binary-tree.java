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

class Solution
{
    int count =0;
    
    public int goodNodes(TreeNode root) 
    {
        count_good_nodes(root , root.val);
        return count;
    }
    
    private void count_good_nodes(TreeNode root , int max_value)
    {
        if(root == null)
            return;
        
        if(root.val >= max_value)
            count++;
        
        count_good_nodes(root.left , Math.max(max_value , root.val));
        count_good_nodes(root.right , Math.max(max_value , root.val));
    }
}