class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> hm=new HashMap<>();
        boolean corOrder=true;
		// putting all elements of order into hashmap with their indices as values for comparison
        for(int i=0;i<order.length();i++){
            hm.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length;i++){
            if(i==0)
                continue;
				// checking pair of strings
            corOrder=compareStr(hm,words[i],words[i-1]);
            if(!corOrder)
                break;
        }
        return corOrder;
    }
    public boolean compareStr(HashMap<Character,Integer> h,String s1,String s2){
        int i=0;
        int j=0;
        while(i<s1.length()&&j<s2.length()){
            if((s1.charAt(i)==s2.charAt(j))){
                j++;
                i++;
                continue;
            }
			// comparing values of two characters when unequal
            if((h.get(s1.charAt(i))>h.get(s2.charAt(j)))){
                return true;
            }
            else
                return false;
            
        }
        if(j!=s2.length()&&i==s1.length())
            return false;
            
        return true;
    }
}