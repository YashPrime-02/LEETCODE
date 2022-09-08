class Solution {
    public boolean searchMatrix(int[][] arr, int target)
    {
    int row=0,col=arr[row].length-1; 
    while(col>=0 && row<arr.length)
    {
     if(arr[row][col]==target)
        return true;
     else if(arr[row][col]>target)
        col--;            
     else
        row++;           
    }
     return false;       
    }
}