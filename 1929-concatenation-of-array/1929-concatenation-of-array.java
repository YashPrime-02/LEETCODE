class Solution {
    public int[] getConcatenation(int[] nums) 
    {
    //int j=0;        
    int n = nums.length;
    int[] b = new int[2*n];
        
        for(int i = 0; i<nums.length; i++){
           b[i] = nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            b[i+n] = nums[i];
        }
        return b;    
    }
}