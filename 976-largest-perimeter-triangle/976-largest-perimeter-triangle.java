class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int result= 0;
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i],b=nums[i+1],c=nums[i+2];            
            if(a+b>c&&b+c>a&&c+a>b)
                result= a+b+c;
        }
        return result;
    }
}