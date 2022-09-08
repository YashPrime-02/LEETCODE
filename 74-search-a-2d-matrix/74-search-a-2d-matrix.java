class Solution {
    public boolean searchMatrix(int[][] arr, int target)
    {
    int row=arr.length,col=arr[0].length; 
    int start=0,end=(row*col) -1;
    while(start<=end)
    {
    int mid=start+ (end-start)/2;
    int val =arr[mid/col][mid%col];
    if(val==target)
      return true;
    else if(val>target)
            end=mid-1;
    else
            start=mid+1;
    }
            return false;
    }
}