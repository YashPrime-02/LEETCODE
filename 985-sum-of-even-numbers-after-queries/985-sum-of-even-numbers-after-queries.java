class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    int evenSum=0;
    int[] ans = new int[queries.length];
    int k=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            evenSum+=nums[i];
        }
    }
    for(int[] i : queries){
        if(nums[i[1]]%2==0){
            evenSum-=nums[i[1]];
        }
        nums[i[1]]+=i[0];
        if(nums[i[1]]%2==0){
            evenSum+=nums[i[1]];
        }
        ans[k++]=evenSum;
    }
    return ans;
    
}
}