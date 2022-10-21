class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            map.put(nums[i],i);
            
            else // nums[i] == nums[j] condition handled
            {
                int j = map.get(nums[i]);
                
                if(Math.abs(i-j) <=k) // abs(i-j) <=k condition here
                    return true;
                
                else
                    map.put(nums[i],i);
                
        }
        }
            return false;
        
    
}
}