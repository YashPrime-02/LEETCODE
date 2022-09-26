class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();                
                if (cur.right != null) q.offer(cur.right);
                if (cur.left != null) q.offer(cur.left);
                if (i == 0) {
                    ans.add(cur.val);
                }
            }        
        }
        return ans;
    }
}