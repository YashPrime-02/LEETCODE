class Solution {
     public int concatenatedBinary(int n) {
        int modulo = 1000000007; //10^9+7
        long ans =0;
        for(int i=1; i<=n; i++){
            //(((previous_value << no_of_digits)%modulo) + i )%modulo
            //no_of_digits i.e 1+log2(i)
            ans = (((ans<<(1+(int)(Math.log(i) / Math.log(2))))%modulo)+i)%modulo;
        }
        return (int)ans;
    }
}
