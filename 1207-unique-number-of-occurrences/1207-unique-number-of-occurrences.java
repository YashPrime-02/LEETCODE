class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> num_occur=new HashMap();
            for(int i:arr)
            {
            num_occur.put(i,num_occur.getOrDefault(i,0)+1);  //increementing frequency of each element in array if present    
            }
            HashSet<Integer> uni_val=new HashSet(num_occur.values()); // keeping only unique frequency ones
            return(num_occur.size()==uni_val.size());
    }
}