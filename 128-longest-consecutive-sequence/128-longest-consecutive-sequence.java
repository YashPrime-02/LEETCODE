class Solution {
public int longestConsecutive(int[] nums) {

    if(nums.length == 0){
        return 0;
    }
    
    int longestLength = 1;
    Arrays.sort(nums);
    int currentLength = 1;
    
    for(int i=1; i<nums.length; i++){
        
        if(nums[i] != nums[i-1]){
            
           if(nums[i] == nums[i-1] +1){
               currentLength += 1;
           }
            
            else{
                longestLength = Math.max(currentLength , longestLength);
                currentLength =1;
                
            }
        }
       }
    
    return Math.max(currentLength , longestLength);
}
}