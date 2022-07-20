class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<String, Boolean> hm = new HashMap();
        
        for(int i = 0; i < words.length; i++) {
            String w = words[i];
            
            int j = 0;
            int k = 0;
            if(!hm.containsKey(w)) {
                while(j < w.length() && k < s.length()) {
                    if(w.charAt(j) == s.charAt(k)) {
                        j++;
                        k++;
                    } else {
                        k++;
                    }
                }
                
                if(j >= w.length()) {
                    hm.put(w, true);
                    count++;
                } else {
                    hm.put(w, false);
                }
            } else {
                if(hm.get(w)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}