class Solution {
    public int minPartitions(String n)
    {
    int max=0;
    
    for(char chr : n.toCharArray())
    {
    int temp= chr-'0';
    if(max<temp)
    max=temp;
    }
            return max;
    }
}