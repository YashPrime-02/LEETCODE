import java.util.*;
class Solution {
    public int maxProfit(int[] prices) 
    {
    if(prices==null || prices.length<=1)
            return 0;
            int MinPro=prices[0];
            int result=0;
            for(int i=0;i<prices.length;i++)
            {
             result=Math.max(result,prices[i]-MinPro);       
             MinPro= Math.min(MinPro,prices[i]);
            }
    return(result);
    }
        
}