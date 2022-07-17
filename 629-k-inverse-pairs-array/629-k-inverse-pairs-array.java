class Solution {
    int mod = 1000000007;
    public int kInversePairs(int n, int k) {
        
        
        int[] dp = new int[k+1];
        
        //answer for all values of N starting 1 going to N
        
        for(int i =1;i<=n;i++){
            
           int [] prow = new int[k+1];
            prow[0] = 1;
            
            for(int j =1;j<=k;j++){
                int val = (dp[j] + mod - ((j-i >= 0) ? dp[j-i] : 0)) % mod;
                prow[j] = (prow[j-1] + val) % mod;
                }
            dp = prow;
            }
        
        return ((dp[k] + mod - (k > 0 ? dp[k-1] : 0)) % mod);
        }
        
        
    
}