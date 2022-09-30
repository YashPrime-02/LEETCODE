class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum,0);
    }
    
    public boolean solve(TreeNode node,int target,int sum){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
            sum+=node.val;
            if(target==sum){
                return true;
            }
        }
        sum+=node.val;
        return(solve(node.left,target,sum)||solve(node.right,target,sum));
    }
}