class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        final Map<String, Integer> wordFrequency = new HashMap<>();
        for (final String word : words) {
            wordFrequency.compute(word, (w, freq) -> freq == null ? 1 : 1 + freq); 
        }
        
        final List<Integer> indexes = new ArrayList<>();
        final int stringSize = s.length(), totalWords = words.length, wordsLength = words[0].length();
        
        for (int i = 0, last = stringSize - totalWords * wordsLength + 1; i < last; i++) {
            final Map<String, Integer> currWordFrequency = new HashMap<>();
            int j = 0;
            
            while (j < totalWords) {
                final String word = s.substring(i + j * wordsLength, i + (j + 1) * wordsLength);
                final int actualFrequency = wordFrequency.getOrDefault(word, 0);
                
                if (actualFrequency == 0 || 
                    currWordFrequency.compute(word, (w, freq) -> freq == null ? 1 : 1 + freq) > actualFrequency) 
                    break;
                
                j++;
            }
            
            if (j == totalWords) indexes.add(i);

        }
        return indexes;
    }
}