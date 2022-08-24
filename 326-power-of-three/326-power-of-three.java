class Solution {
public boolean isPowerOfThree(int n) {

    if(n < 1) { return false; }
    
    while(true) {
        if(n == 1) { return true; }
        if(n % 3 != 0) { return false; }
        n /= 3;
    }
    
}
}