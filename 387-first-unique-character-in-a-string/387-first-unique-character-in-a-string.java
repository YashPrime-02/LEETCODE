class Solution {
    public int firstUniqChar(String str) {
        HashMap <Character,Integer> mp= new LinkedHashMap<Character,Integer>();
        HashMap <Character,Integer> m1= new LinkedHashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++){
            if(!m1.containsKey(str.charAt(i))){
                mp.put(str.charAt(i), i);
                m1.put(str.charAt(i), i);
            }
            else{
                if(mp.containsKey(str.charAt(i))) mp.remove(str.charAt(i));
            }
        }
        if(mp.size()==0) return -1;
        Object x= mp.keySet().toArray()[0];
        return mp.get((char)x);
    }
}