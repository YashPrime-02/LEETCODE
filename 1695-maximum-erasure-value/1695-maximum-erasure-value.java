class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>loc=new HashMap<>(); //stores the index of last occurrance of the number
        HashMap<Integer,Integer>sum=new HashMap<>(); //stores the prefix sum
        int ans=0;
        int total=0;//stores the sum upto the index
        int idx=-1;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            if(loc.containsKey(nums[i]))
                idx=Math.max(idx,loc.get(nums[i]));
            if(idx==-1)
                ans=Math.max(ans,total);
            else
                ans=Math.max(ans,total-sum.get(idx));//subtract prefix sum of starting of subarray from total to get sum of subarray
            loc.put(nums[i],i);//update last occurance of the number
            sum.put(i,total);//update prefix sum
        }
        return ans;
    }
}