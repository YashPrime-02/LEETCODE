class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i=0; i<m+n; i++){
            if(j<n&&nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}