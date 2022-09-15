class Solution {
    public int[] findOriginalArray(int[] changed) {
        
     
        if (changed.length % 2 != 0) return new int[]{};
        Arrays.sort(changed);
        HashMap<Integer, Integer> freqMap = new HashMap();
        for(int i = 0; i < changed.length; i++) {
            int curr = changed[i];
            freqMap.put(curr, freqMap.getOrDefault(curr, 0) + 1);
        }
       int[] result = new int[changed.length / 2];
        int index = 0;
        for(int i: changed) {
            if (i == 0 && freqMap.containsKey(0) && freqMap.get(0) >= 2) {
                decrementValue(freqMap, 0, 2);
                result[index] = 0;
                index++;
            } else if (i != 0 
                       && freqMap.containsKey(i) 
                       && freqMap.containsKey(i * 2)) {
               
                decrementValue(freqMap, i, 1);
                decrementValue(freqMap, i * 2, 1);
                result[index] = i;
                index++;
            } 
        }
        
        if (freqMap.size() > 0) return new int[]{};
        
        return result;
    }
    
    // decrments the frequency of a particular key in the hashmap.  If we end up at 0 frequency,
    // we will remvove the key from the map
    public void decrementValue(HashMap<Integer, Integer> freqMap, int value, int amount) {
        freqMap.put(value, freqMap.get(value) - amount);
        if (freqMap.get(value) == 0) {
            freqMap.remove(value);
        }
    }
}