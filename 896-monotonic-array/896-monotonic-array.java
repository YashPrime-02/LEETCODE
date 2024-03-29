class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                inc = false;
            if (A[i] < A[i+1])
                dec = false;
        }

        return inc || dec;
    }
}