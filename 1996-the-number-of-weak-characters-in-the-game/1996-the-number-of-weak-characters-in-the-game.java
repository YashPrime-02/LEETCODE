class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        int n=arr.length;
        int count=0;
        Arrays.sort(arr,(p,q)->(p[0]==q[0]?p[1]-q[1]:q[0]-p[0]));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i][1],max);
            if(arr[i][1]<max)count++;
        }
       return count;
        
    }
}