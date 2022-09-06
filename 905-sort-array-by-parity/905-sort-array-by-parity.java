class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
    int res[]=new int[nums.length];
    int f=0,k=nums.length-1;
    for(int val: nums)
    {
    if(val%2==0)
            res[f++]=val;
    
            else
                  res[k--]=val;
    }
    
    return(res);
    }
}