class Solution {
   public int[] intersect(int[] nums1, int[] nums2) 
   {
    HashMap<Integer,Integer>fmap=new HashMap<>();       
for(int val:nums1)
{
if(fmap.containsKey(val))
{
int of=fmap.get(val);
int nf=of+1;
fmap.put(val,nf);
}
else
fmap.put(val,1);
}
ArrayList<Integer> Al=new ArrayList<>();
for(int val:nums2)
{
if(fmap.get(val)!=null && fmap.get(val)>0)
{
Al.add(val);        
int of2=fmap.get(val);
int nf2=of2-1;
fmap.put(val,nf2);        
}       
}
int[] res = new int[Al.size()]; 
for(int i = 0; i < Al.size();i++)
{
res[i] = Al.get(i);
}
return res;
}
}