class Solution {
    public String breakPalindrome(String str) 
    {
     if (str.length() == 1) 
        return "";
     char[] ch = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (ch[i] != 'a') {
               
                ch[i] = 'a';
               
                return new String(ch);
            }
        }
        ch[str.length() - 1] = 'b';
        return new String(ch);
    }
}