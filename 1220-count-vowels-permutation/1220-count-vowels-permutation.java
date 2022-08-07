class Solution {
    private int[][] memo;
    
    private static Map<Character, Integer> charMap = new HashMap<>();
    static {
        charMap.put('a', 0);
        charMap.put('e', 1);
        charMap.put('i', 2);
        charMap.put('o', 3);
        charMap.put('u', 4);
    }
    
    public int countVowelPermutation(int n) {
        memo = new int[n + 1][5];
        
        long answer = (long)countVowelPermutation(n - 1, 'a') +
                      (long)countVowelPermutation(n - 1, 'e') +
                      (long)countVowelPermutation(n - 1, 'i') +
                      (long)countVowelPermutation(n - 1, 'o') +
                      (long)countVowelPermutation(n - 1, 'u');
        
        return (int)(answer % 1000000007);
    }
    
    private int countVowelPermutation(int n, char prevChar)
    {
        if (n == 0) return 1;
        
        int charIndex = charMap.get(prevChar);
        if (memo[n][charIndex] != 0)
            return memo[n][charIndex];
        
        long answer = 0;
        
        if (prevChar == 'a')  // 'a' may only be followed by an 'e'
            answer = countVowelPermutation(n - 1, 'e');
        
        else if (prevChar == 'e') // 'e' may only be followed by an 'a' or an 'i'
            answer = (long)countVowelPermutation(n - 1, 'a') + (long)countVowelPermutation(n - 1, 'i');
        
        else if (prevChar == 'i') // 'i' may not be followed by another 'i' (may be followed by others
            answer = (long)countVowelPermutation(n - 1, 'a') + (long)countVowelPermutation(n - 1, 'e') +
                     (long)countVowelPermutation(n - 1, 'o') + (long)countVowelPermutation(n - 1, 'u');
        
        else if (prevChar == 'o') // 'o' may only be followed by an 'i' or a 'u'
            answer = (long)countVowelPermutation(n - 1, 'i') + (long)countVowelPermutation(n - 1, 'u');
        
        else if (prevChar == 'u') // 'u' may only be followed by an 'a'
            answer = countVowelPermutation(n - 1, 'a');
        
        memo[n][charIndex] = (int)(answer % 1000000007);
        
        return memo[n][charIndex];
    }
}