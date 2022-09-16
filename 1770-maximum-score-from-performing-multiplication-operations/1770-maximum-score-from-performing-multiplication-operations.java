class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
    
        
     Map<Integer, Map<Integer,Integer>> memo=new  HashMap<>();  
    /*int dp[][]= new int[nums.length][nums.length];    
    for (int i = 0; i < nums.length; i++)
            Arrays.fill(dp[i], Integer.MIN_VALUE);*/
        
    return maxScore(nums, multipliers, 0, nums.length-1, 0, memo);        
    
    }
    
    public int  maxScore(int[] nums, int[] multipliers, int initial, int destination, int counter,  Map<Integer, Map<Integer,Integer>> memo){
   
        if(counter==multipliers.length)
         return 0;

        
      if(memo.get(initial)!=null && memo.get(initial).get(destination)!=null)
          return memo.get(initial).get(destination);
        
      int first=(multipliers[counter]*nums[initial]) + maxScore(nums, multipliers, initial+1, destination, counter+1, memo); 
      
        int second=(multipliers[counter]*nums[destination]) + maxScore(nums, multipliers,initial, destination-1, counter+1, memo);
        
      int ans=Math.max(first, second);  
      
      if(memo.get(initial)==null)
        memo.put(initial, new HashMap<Integer,Integer>());
      
      memo.get(initial).put(destination,ans); 
                
      return ans;
    }
    
}