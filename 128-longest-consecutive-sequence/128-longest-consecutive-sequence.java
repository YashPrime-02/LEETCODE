class Solution {
    public int longestConsecutive(int[] nums) 
    {
    HashMap<Integer,Boolean> map=new HashMap<>();
            for(int val:nums)
            {
            map.put(val,true);        
            }
            for(int val:nums)
            {
            if(map.containsKey(val-1))
            {
            map.put(val,false);        
            }
            }
            int max=0,mlen=0;
            for(int val:nums)
            {
            
            if(map.get(val)==true)
            {
            int len=1;
            int stpoint=val;
                    while(map.containsKey(stpoint+len))
                    {
                    len++;        
                    }
                    if(len>mlen)
                    {
                    max=stpoint;
                    mlen=len;
                    }
            }
            }
            return(mlen);
            }
            
    }
