class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return (nums.length == 0) ? null : new TreeNode(
                nums[nums.length / 2],
                sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2)),
                sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length))
        );
    }
}
