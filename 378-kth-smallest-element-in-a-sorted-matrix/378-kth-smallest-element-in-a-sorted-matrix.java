class Solution {
    public int kthSmallest(int[][] matrix, int t) {
        
        int[] array = new int[matrix.length*matrix[0].length];
        int k=0;
        
        for(int[]arr : matrix){
            for(int i : arr){
                array[k++]=i;
            }
        }
    Arrays.sort(array);
        return array[t-1];
    }
}