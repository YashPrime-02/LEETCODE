class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Double> list = new ArrayList<Double>();
        q.add(root);
        while(!q.isEmpty()){
            Queue<TreeNode> qq = new LinkedList<TreeNode>();
            Double i=0.0,avg=0.0;
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                int v = node.val;
                if(node.left!=null) qq.add(node.left);
                if(node.right!=null) qq.add(node.right);
                avg+=node.val;
                i++;
            }
            list.add(avg/i);
            q=qq;
        }
        return list;
    }
}