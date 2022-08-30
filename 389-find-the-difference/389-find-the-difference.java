class Solution {
    public char findTheDifference(String s, String t) {
            Map<Character ,Integer> map=new HashMap<>();
       if(s.length()==0) return t.charAt(0);
       String z=s+t;
        for(int i=0;i<z.length();i++){
        char x=z.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char i: map.keySet()){
            int j=map.get(i);
            if((j&1)==1) return i;
        }
        return 'a';

        
    }
}