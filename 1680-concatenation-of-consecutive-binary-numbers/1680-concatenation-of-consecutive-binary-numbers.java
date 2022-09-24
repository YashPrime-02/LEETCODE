class Solution {
    public int concatenatedBinary(int n) 
    {
    int  i,len=0;
    long res=1;
    for(i=2;i<=n;i++)
    {
     len=(int)(Math.log(i)/Math.log(2))+1;
     
     res=((res<<len)|i)%1000000007;       
     }
    return (int)res;
    }
}