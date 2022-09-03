class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        
        for(int num = 1; num < 10; num++){
            dfs(n-1, num, res, k);
        }
        
        return res.stream().mapToInt(i->i).toArray();
        
    }
    
    
    private void dfs(int n, int num, List<Integer> res, int k){
        // Base case
        
        if(n == 0){
            res.add(num);
            return;
        }
        
        if(0<=((num%10) + k)   && ((num%10) + k) < 10){
        dfs(n-1, num*10+((num%10) + k), res, k);
        }
        
        if(k != 0 && 0<=((num%10) - k)   && ((num%10) - k) < 10){
            dfs(n-1, num*10 + ((num%10)-k), res, k);
        }
        
    }
    
    
    
}