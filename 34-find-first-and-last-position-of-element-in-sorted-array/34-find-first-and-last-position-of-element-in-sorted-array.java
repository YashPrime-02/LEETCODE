class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        int low = 0,end=nums.length-1,start=-1,last=-1;
        while(low<=end){
            int mid = low+(end-low)/2;
            if(nums[mid]==target){
                start=mid;
                end=mid-1;
            }
            else if(nums[mid]>target)
                end = mid-1;
            else
                low=mid+1;
        }
        low=0;
        end=nums.length-1;
        while(low<=end){
            int mid = low+(end-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target)
                end = mid-1;
            else
                low=mid+1;
        }
        res[0]=start;
        res[1]=last;
        return res;
    }
}