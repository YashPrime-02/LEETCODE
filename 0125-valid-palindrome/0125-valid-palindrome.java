class Solution {
        public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder("");
        s = s.trim();
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                ans.append((char)(ch+32));
            }
            else if((ch >= 97 && ch <= 122) || (ch >=48 && ch<=57) ){
                ans.append(ch);
            }
        }
        return (ans.toString()).equals(ans.reverse().toString());
    }
		}