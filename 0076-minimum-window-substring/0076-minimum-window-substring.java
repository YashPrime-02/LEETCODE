class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>small=new HashMap<>();
        HashMap<Character,Integer>big=new HashMap<>();
        for(char c: t.toCharArray()){
            small.put(c,small.getOrDefault(c,0)+1);
        }
        int n=s.length();
        int matchCount=0;
        int m=t.length();
        int left=0;
        int start=-1;
        int end=-1;
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            int f1=small.getOrDefault(c,0);
            int f2=big.getOrDefault(c,0);
            if(f2+1<=f1){
                matchCount++;
            }
            big.put(c,big.getOrDefault(c,0)+1);
            while(matchCount==m){
                char leftChar=s.charAt(left);
                f1=small.getOrDefault(leftChar,0);
                f2=big.getOrDefault(leftChar,0);
                if(start==-1){
                    start=left;
                    end=right;
                }else{
                    if(end-start+1>right-left+1){
                        start=left;
                        end=right;
                    }
                }
                if(f2-1<f1){
                    matchCount--;
                }
                big.put(leftChar,big.get(leftChar)-1);
                if(big.get(leftChar)==0){
                    big.remove(leftChar);
                }
                left++;
            }
        }

        return start==-1?"":s.substring(start,end+1);
    }
}