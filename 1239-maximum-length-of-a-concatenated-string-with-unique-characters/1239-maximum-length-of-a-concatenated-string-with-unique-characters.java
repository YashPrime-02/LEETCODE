class Solution {
    public int maxLength(List<String> arr) {
        int res[] = new int[1];
        solve(0, arr, "", res);
        return res[0];
    }
    
    private void solve(int i, List<String> arr, String sub, int res[]) {
        if (checkUnique(sub)) res[0] = Math.max(res[0], sub.length());
        if (i >= arr.size()) return;
        solve(i + 1, arr, sub + arr.get(i), res);
        solve(i + 1, arr, sub, res);
    }
    
    private boolean checkUnique(String s) {
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            if (arr[c - 'a'] >= 1) return false;
            arr[c - 'a']++;
        }
        return true;
    }
}