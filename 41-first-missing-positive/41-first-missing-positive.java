class Solution {
    public int firstMissingPositive(int[] nums) 
    {
    int i=0;        
    Arrays.sort(nums);
    int k=nums[nums.length-1];        
    HashSet<Integer> fmap=new HashSet<>();
    for(int val:nums)
    {
     fmap.add(val);       
    }
        for(i=1;i<=k;i++)
    {
    if(!fmap.contains(i))
       break;
    }
    return i;        
    }
    
    }