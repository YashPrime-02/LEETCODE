class Solution {
    List<Integer> res = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        check(root);
        for(int i = 0; i+1 < res.size(); i++){
            if(res.get(i) >= res.get(i+1)){
                return false;
            }
        }
        
        return true;
    }
    
    public void check(TreeNode root){
        if(root != null){
            check(root.left);
            res.add(root.val);
            check(root.right);
        }
    }
}