class Solution 
{
public int findKthLargest(int[] nums, int k) 
{
PriorityQueue<Integer> pq=new PriorityQueue<>();
for(int i=0;i<nums.length;i++)
{
if(i<k)
pq.add(nums[i]);
else
{
if(nums[i]>pq.peek())
{
pq.remove();
pq.add(nums[i]);    
}
}
}
//while(pq.size()>0)
return(pq.remove());
}
}