class NumArray {
    
    int[] prefixSums;

    public NumArray(int[] nums) {
        prefixSums = new int[nums.length];
        prefixSums[0] = nums[0];  // ok to access nums[0] directly, given constraints
        for (int i = 1; i < prefixSums.length; i++)
            prefixSums[i] = nums[i] + prefixSums[i-1];   // won't overflow, given constraints
    }
    
    public int sumRange(int left, int right) {
        return left == 0 ? prefixSums[right] : prefixSums[right] - prefixSums[left-1];
    } 
}