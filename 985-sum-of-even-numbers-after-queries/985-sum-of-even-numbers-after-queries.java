class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int l = q.length,firstNum = 0;
        int [] ans = new int[l];
        for(int a:nums){
            if(a%2==0)firstNum+=a;
        }
        for(int i=0;i<l;i++){
            int index = q[i][1] , val = q[i][0] ,a = nums[index];
            if(a%2==0){
                if((a + val)%2==0){
                    ans[i] = firstNum + val;
                    firstNum = firstNum + val;
                }else{
                    ans[i] = firstNum - a;
                    firstNum = firstNum - a;
                }
            }else{
                if((a + val)%2==0){
                    ans[i] = firstNum + val + a;
                    firstNum = firstNum + val + a;
                }else{
                    ans[i] = firstNum;
                }
            }
            nums[index] = nums[index] + val;
        }
        return ans;
    }
}