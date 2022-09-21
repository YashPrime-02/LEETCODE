class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length; //row length
        int col = mat[0].length; //column  length

        if (row * col != r * c) {
            return mat; //Checking If Matrix Can be Reshaped Or Not
        }

        int total_Elements = r * c; //total elements in new matrix

        int[][] res = new int[r][c];
        for (int i = 0; i < total_Elements; i++) 
        { 
        res[i / c][i % c] = mat[i / col][i % col];
        }
        return res;
    }
}
