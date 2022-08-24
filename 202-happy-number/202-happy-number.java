class Solution {
   public boolean isHappy(int n) {
    if (n < 10)
        if (n != 1 && n!=7)
            return false;
    int sum = getsum(n);
    if (sum==1) return true;
    return isHappy(sum);
}

public int getsum(int n) {
    int sum = 0;
    while (n > 0) {
        int i = n % 10;
        sum += i * i;
        n = n / 10;
    }
    return sum;
}
}