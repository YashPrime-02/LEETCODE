class Solution {
    Set<Integer> s = new HashSet();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null ) return false;
        if(root != null) {
            int rest = k - root.val;
            if(s.contains(rest)){
                return true;
            }
            s.add(root.val);
        }
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}