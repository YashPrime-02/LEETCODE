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
int sum  =0;
public int sumOfLeftLeaves(TreeNode root) {
    //code here 
    
    if(root==null || root.left == null && root.right == null){
        return 0;
    }
     leafSum(root, true);
        return sum;
}
public void leafSum(TreeNode root, boolean isLeaf){
    
    if(root==null){
        return ;
    }
    if(root.left==null && root.right == null && isLeaf==true){
        sum+= root.val;
        return ;
    }
    
    leafSum(root.left, true);
    leafSum(root.right, false);
}
}