class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {    
        int n1 = word1.length();
        int n2 = word2.length();
    
        int n = (n1 <= n2) ? n1 : n2;
        
        String res = "";
        
        int i;
        for(i = 0; i<n; i++)
        {
            res += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
        }
        
        if(n1 > n2)     return res + word1.substring(n, n1);
        if(n2 > n1)     return res + word2.substring(n, n2);
        
        return res;
    }
}