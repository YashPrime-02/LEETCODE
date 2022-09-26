class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while (!qu.isEmpty()){
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = qu.poll();                
                if (temp.right != null) qu.offer(temp.right);
                if (temp.left != null) qu.offer(temp.left);
                if (i == 0) {
                    ans.add(temp.val);
                }
            }        
        }
        return ans;
    }
}