class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
    ArrayList<Integer> list=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<nums.length;i++)
            {
            hs.add(nums[i]);        
            }
            for(int j=1;j<=nums.length;j++)
            {
            if(!hs.contains(j))
                    list.add(j);
            }
    return(list);
    }
        
}