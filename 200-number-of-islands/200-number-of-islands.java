class Solution {
    public int numIslands(char[][] grid) {
		int count = 0;
		int m = grid.length;
		int n = grid[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(grid[i][j] == '1')   //call only when you find 1
					count += dfs(grid, i, j, m, n);
			}
		}
		return count;
	}
    
    private int dfs(char[][] grid, int i, int j, int m, int n) {
        //break condition
		if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0')
			return 0;
		grid[i][j] = '0'; //mark visited by changing 1 to 0
        
        //traverse in 4 directions and mark all adjacent 1s visited
		dfs(grid, i - 1, j, m, n);  //LEFT
		dfs(grid, i + 1, j, m, n);  //RIGHT
		dfs(grid, i, j - 1, m, n);  //DOWN
		dfs(grid, i, j + 1, m, n);  //UP
        
        //when done, return 1
		return 1;
	}
}