class Solution {
public int[] intersection(int[] nums1, int[] nums2) {
HashMap<Integer,Integer> hs = new HashMap<>();
for(int i:nums2)
hs.put(i, hs.getOrDefault(i , 0)+1);

    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0; i<nums1.length; i++){
        if(hs.containsKey(nums1[i])){
            arr.add(nums1[i]);
            hs.remove(nums1[i]);
        }
    }
    int[] ans = new int[arr.size()];
    for(int i=0;i<ans.length;i++){
        ans[i] = arr.get(i);
    }
    return ans;
}
}