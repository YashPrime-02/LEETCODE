class Solution {
    public void rotate(int[][] matrix) {
     // Here we transpose the matrix and print reverse of each row in matrix
        
        //Task -1 Transpose 
            
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int tempo = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tempo;
            }
        }
        
        
        //Task -2 Reverse 
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}