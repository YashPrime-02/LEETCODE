class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false;
        return dfs(s1, s2, s3, 0, 0, new HashMap<>());
    }
    
    private boolean dfs(String s1, String s2, String s3, int i, int j, Map<String, Boolean> map) {
        if(i == s1.length() && j == s2.length()) return true;
        
        String key = i + "," + j;
        if(map.containsKey(key)) return map.get(key);
        
        if(i < s1.length() && s1.charAt(i) == s3.charAt(i + j) && dfs(s1, s2, s3, i + 1, j, map)) return true;
        if(j < s2.length() && s2.charAt(j) == s3.charAt(i + j) && dfs(s1, s2, s3, i, j + 1, map)) return true;
        
        map.put(key, false);
        return false;
    }
}