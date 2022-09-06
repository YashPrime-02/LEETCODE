class Solution {
    public int maximumProduct(int[] nums) 
    {       
     Arrays.sort(nums);
        int n=nums.length;
        long a=(nums[n-1]*nums[n-2]*nums[n-3]);
        long b=(nums[0]*nums[1]*nums[n-1]);
        int y= (int)Math.max(a,b);
            return(y);
            
    }
}