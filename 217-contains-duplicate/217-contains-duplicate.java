class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hset = new HashSet<>();
        for(int i:nums){
            
            if(hset.contains(i)) return true;
            
            hset.add(i);
        }
        return false;
    }
}