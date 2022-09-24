class Solution {
    public int concatenatedBinary(int n) 
    {
    int mod=1000000007,i,len=0;
    long ans=0;
    for(i=1;i<=n;i++)
    {
    String res=Integer.toBinaryString(i);
    len=res.length();
    ans=ans<<len;
    ans+=i;
    ans=ans%mod;        
    }
            return (int)ans;}
}