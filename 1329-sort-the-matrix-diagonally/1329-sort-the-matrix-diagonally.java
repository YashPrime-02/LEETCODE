class Solution {
 public int[][] diagonalSort(int[][] mat) {
int m =mat.length;
int n =mat[0].length;
for(int i=0;i<m;i++){
sort(mat, i, 0, m, n);
}

    for(int i=0;i<n;i++){
        sort(mat, 0, i, m, n);
    }
    return mat;
}
void sort(int[][] mat, int row, int col, int m, int n){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int i=row;
    int j=col;
    while(i<m&&j<n){
        pq.add(mat[i][j]);
        i++;
        j++;
    }
    i=row;
    j=col;
    while(pq.size()>0)
    {
        mat[i++][j++] = pq.poll();
    }
}
}