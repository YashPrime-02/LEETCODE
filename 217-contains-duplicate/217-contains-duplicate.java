class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        
        for(int i: nums){
            if(fmap.containsKey(i)) 
                    return true;
            
            else
                fmap.put(i,1);
        }
        return false;
    }
}