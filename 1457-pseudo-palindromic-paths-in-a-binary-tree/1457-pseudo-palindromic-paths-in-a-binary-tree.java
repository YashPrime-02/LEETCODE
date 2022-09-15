class Solution {
    
    int result = 0;
  
    public int pseudoPalindromicPaths (TreeNode root) {
      int[] nums = new int[10];
      dfs(nums, root);
      return result;
    }
  
    public void dfs(int[] nums, TreeNode root) {
      
      if (root == null)
        return;
      
      nums[root.val]++;
      
      if (root.left == null && root.right == null) {
        if (check(nums))
          result++;
      }
      
      dfs(nums, root.right);
      dfs(nums, root.left); 
      nums[root.val]--;
      
    }
  
    public boolean check(int[] nums) {
      
      boolean value = false;
      int l = 0;
      
      for (int a = 1; a < nums.length; a++) {
        if (nums[a]%2 == 1) {
          if (value)
            return false;
          value = true;
        }
      }
      
      return true;
    }
}