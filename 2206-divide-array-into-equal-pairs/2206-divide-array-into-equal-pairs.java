class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        int pair = nums.length/2,count=0;
        for(int key:hmap.keySet()){
            count+=(hmap.get(key)/2);
        }
        return count==pair;
    }
}