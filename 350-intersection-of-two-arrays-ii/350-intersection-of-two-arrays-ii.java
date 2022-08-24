class Solution {
   public int[] intersect(int[] nums1, int[] nums2) 
   {
HashMap<Integer, Integer> map = new HashMap<>();
for(int val : nums1)
{
if(map.containsKey(val))
{
int of =map.get(val);
int nf=of+1;
map.put(val,nf);
}
else
map.put(val,1);
}
ArrayList<Integer> list = new ArrayList<>();
        for(int val : nums2){
            if(map.get(val) != null && map.get(val) > 0){
                list.add(val);
                map.put(val, map.get(val) - 1);
            }
        }
        int[] ret = new int[list.size()]; 
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}