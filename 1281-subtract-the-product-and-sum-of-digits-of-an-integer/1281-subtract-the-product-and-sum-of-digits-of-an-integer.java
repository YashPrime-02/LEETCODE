class Solution {
    public int subtractProductAndSum(int n) {
        
        int p=1;
        int s=0;
        
        while(n>0){
            int i = n%10;
            p*=i;
            s+=i;
            n=n/10;
        }
        
        return p-s;
        
    }
}