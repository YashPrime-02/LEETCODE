class Solution {
    
    
    public void helper(TreeNode root, int level,List<List<Integer>> levels){
        if(root == null) return;
        
        if(level == levels.size()){
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            levels.add(temp);
        }else{
            levels.get(level).add(root.val);
        }
        
        helper(root.left, level+1, levels);
        helper(root.right, level+1, levels);
        
    }
    
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> levels = new ArrayList<>();    

        helper(root,0,levels);
        return levels;
    }
}