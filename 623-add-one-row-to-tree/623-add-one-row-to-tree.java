public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
       
            if (d == 1){
                    TreeNode newroot = new TreeNode(v);
                    newroot.left = root;
                    return newroot;
            }
            
            helper(root, v, 1, d);
             return root;
    }

        void helper(TreeNode root, int val, int d, int depth){
                
                if(root == null){
                return;
                }
                
                if (d < depth){
                        
                        helper(root.left, val, d+1, depth);
                        helper(root.right, val, d+1, depth);
                }
                
                if (d == depth-1){
                        
                        TreeNode left = new TreeNode(val);
                        TreeNode right = new TreeNode(val);
                        
                        left.left = root.left; 
                        right.right = root.right;
                        
                        root.left = left;
                        root.right = right;
                }
                
                
        }
}