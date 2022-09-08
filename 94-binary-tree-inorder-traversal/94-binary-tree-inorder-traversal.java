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
public List inorderTraversal(TreeNode root) {
List ans = new ArrayList();
in(root,ans);
return ans;
}

public void in(TreeNode root,List ans){
if(root==null)
return;
in(root.left,ans);
ans.add(root.val);
in(root.right,ans);
}
}