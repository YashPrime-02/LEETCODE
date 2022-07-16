class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn,Integer[][][] dpm) {
        if(startRow==m || startColumn==n || startRow<0 || startColumn<0)return 1;
        
        if(dpm[startRow][startColumn][maxMove]!=null)return dpm[startRow][startColumn][maxMove];
        
        if(maxMove==0)return 0;
        
        
        int mod=(int)1e9+7;
        
        int ans1=findPaths(m,n,maxMove-1,startRow,startColumn+1,dpm)%mod;
        int ans2=findPaths(m,n,maxMove-1,startRow+1,startColumn,dpm)%mod;
        int ans3=findPaths(m,n,maxMove-1,startRow,startColumn-1,dpm)%mod;
        int ans4=findPaths(m,n,maxMove-1,startRow-1,startColumn,dpm)%mod;
        
        ans1=(ans1+ans2)% 1_000_000_007;
        ans1=(ans1+ans3)% 1_000_000_007;
        ans1=(ans1+ans4)% 1_000_000_007;
        
        return dpm[startRow][startColumn][maxMove]=ans1;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if(startRow>=m || startColumn>=n || startRow<0 || startColumn<0)return 1;
        if(maxMove==0)return 0;
        
        
        return findPaths(m,n,maxMove,startRow,startColumn,new Integer[m][n][maxMove+1]);
    }
}