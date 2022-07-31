class NumArray {

    
    int sum = 0;
    int nums[];
    public NumArray(int[] nums) {
        this.nums = nums;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
    }
    
    public void update(int index, int val) {
        sum = sum - nums[index] + val;
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int i = 0; 
        int tempSum = sum;
        while(i < left) {
            tempSum = tempSum - nums[i];
            i++;
        }
        
        i = nums.length-1;
        
        while(i > right) {
            tempSum = tempSum - nums[i];
            i--;
        }
        
        return tempSum;
    }
}
