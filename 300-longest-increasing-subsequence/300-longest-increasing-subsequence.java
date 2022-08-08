
class Solution {
    public int lengthOfLIS(int[] nums) {
       int n = nums.length;
       int max = 0;
      int dp[] = new int[nums.length+1];
        Arrays.fill(dp,1);
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && dp[i]<dp[j]+1)
                {
                    dp[i]=dp[j]+1;
                }
             }
        }
        
        for(int i=0;i<n;i++)
        {
            if(max<dp[i])
            {
                max=dp[i];
            }
        }
        return max;
    }
}