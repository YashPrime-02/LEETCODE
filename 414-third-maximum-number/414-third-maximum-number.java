class Solution {
    public int thirdMax(int[] nums) 
    {
    HashSet <Integer>hs =new HashSet<>();
    PriorityQueue<Integer>pq=new PriorityQueue<>();
            for(int val:nums)
            {
            if(!(hs.contains(val)))
            {
            hs.add(val);        
            pq.add(val);        
            }
            if(pq.size()>3)
             pq.poll();
            }
            if(pq.size()==2)
            {       pq.poll();
                    return(pq.poll());
            }
                    
            
            return(pq.poll());
    }
}      