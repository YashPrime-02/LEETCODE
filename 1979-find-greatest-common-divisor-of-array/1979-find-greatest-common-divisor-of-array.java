class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallestNumber = nums[0];
        int largestNumber = nums[nums.length  - 1];
        
        int gcd = 0;
        for (int i = 1; i <= largestNumber; i++) {
            if (smallestNumber % i == 0 && largestNumber % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}