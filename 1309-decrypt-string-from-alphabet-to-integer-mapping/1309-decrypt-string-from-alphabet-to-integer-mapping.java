class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i=n-1;i>=0;i--){ // Traverse string reversely.
            char ch = s.charAt(i);
            if ( ch=='#'){
                int j = Integer.parseInt(s.substring(i-2,i));
                //Convert previous two chars into int 
                result.append((char)(j+'a'-1));//convert new int to char using ASCII
                i -= 2;
            }
            else{
                result.append( (char)(ch+'0') );
            }
        }
        result.reverse();
        return result.toString();
    }}