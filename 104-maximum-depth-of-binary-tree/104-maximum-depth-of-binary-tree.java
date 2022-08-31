class Solution {
    int level = 0;
    public int maxDepth(TreeNode root) {
        //Using DFS to traverse
        if(root == null)
            return level;
        visit(root, level);
        return level;
    }
    
    private void visit(TreeNode node, int l){
        //passing level and root node
        if(node == null)
            return;
        //enter and add 1 to level
        int i = l+1;
        //get the greater one
        level = Math.max(i,level);
        
        visit(node.left, i);
        visit(node.right, i);
    }
}
