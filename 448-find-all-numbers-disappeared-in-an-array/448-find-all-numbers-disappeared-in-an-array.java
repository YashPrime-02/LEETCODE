class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int res[]=new int[nums.length+1];
        int n=nums.length;
        
        for(int i : nums)
            res[i]=i;
        
        for(int i=1;i<=n;i++){
            if(res[i]==0)
                result.add(i);
        }   
        return result;
    }
}