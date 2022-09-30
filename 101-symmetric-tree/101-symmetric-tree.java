class Solution {
    
    private boolean isSymmetricfun(TreeNode left , TreeNode right){
        if(left == null || right == null)   return (left == right);
        
        if(left.val != right.val)   return false;
        
        return isSymmetricfun(left.left , right.right) && isSymmetricfun(left.right , right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return (root == null) || isSymmetricfun(root.left , root.right);
        
    }
}