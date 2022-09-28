class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int arr2[]=new int[nums.length+1];
        int n=nums.length;
        
        for(int i : nums)
            arr2[i]=i;
        
        for(int i=1;i<=n;i++){
            if(arr2[i]==0)
                res.add(i);
        }   
        return res;
    }
}