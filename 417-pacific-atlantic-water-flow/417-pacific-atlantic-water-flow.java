class Solution {
   
    int[] rows = {-1 , 0 , 1 , 0} ;
    int[] cols = {0 , 1 , 0 , -1} ;
    
     List<List<Integer>> res = new ArrayList<List<Integer>>() ;
    
    class Index{
        int x ;
        int y ;
        
        Index(int x , int y){
            this.x = x ;
            this.y = y ;
        }
    }
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length ;
        int col = heights[0].length ;
        
         boolean[][] pacific = new boolean[201][201];
        boolean[][] atlantic = new boolean[201][201] ;
        
        for(boolean[] arr : pacific)
            Arrays.fill(arr , false) ;
        
         for(boolean[] arr : atlantic)
            Arrays.fill(arr , false) ;
     
        Queue<Index> pue = new LinkedList<Index>() ;
        Queue<Index> aue = new LinkedList<Index>() ;
        
        
       for(int i = 0 ; i < row ; i++){
           for(int j = 0 ; j < col ; j++){
               if(i == 0 || j == 0){
                   pacific[i][j] = true ;
                   pue.add(new Index(i, j) );
               }
               
               if(i == row-1 || j == col-1){
                   atlantic[i][j] = true ;
                   aue.add(new Index(i , j) );
               }
           }
       }
        
         bfs(heights , pue , pacific) ;
        bfs(heights , aue , atlantic) ;
        
        
        
        for(int i = 0 ; i < row ; i++){
            for(int j =0 ; j < col ; j++){
                if(pacific[i][j] == true && atlantic[i][j] == true){
                    ArrayList<Integer> li = new ArrayList<>() ;
                    li.add(i) ;
                    li.add(j) ;
                    res.add(li) ;
                    }
            }
                
        }
        
        return res ;
        
    }
    
    private void bfs(int[][] heights , Queue<Index> ue , boolean[][] visited ){
        int n = heights.length ;
        int m = heights[0].length ;
        
        while(! ue.isEmpty() ){
            int x = ue.peek().x ;
            int y = ue.peek().y ;
            
            ue.poll() ;
            
            for(int k = 0 ;  k < 4 ; k++){
                int idx1 = x + rows[k] ;
                int idx2 = y + cols[k] ;
                
                if(idx1 >= 0 && idx2 >= 0 && idx1 < n
                   && idx2 < m && heights[x][y] <= heights[idx1][idx2] 
                  && visited[idx1][idx2] == false){
                    visited[idx1][idx2] = true ;
                    ue.add(new Index(idx1 , idx2) );
                    
                }
            }
        }
        
        return ;
    }
}