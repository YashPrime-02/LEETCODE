class Solution {
    
    private int findFromArray(int[] arr, int n, int k){
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum <= k) ans = Math.max(ans, sum);
                if(sum == k) return ans;
            }
        }
        return ans;
    }
    
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if(matrix.length == 0 || matrix == null) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            int[] arr = new int[n];
            for(int j=i; j<m; j++){
                for(int x=0; x<n; x++) arr[x] += matrix[j][x];
                
                ans = Math.max(ans, findFromArray(arr, n, k));
                if(ans == k) return ans;
            }
        }
        return ans;
    }
}