class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());//convert hashmap keys into list
        list.sort((x,y) -> map.get(y) - map.get(x));//sort the list 
        
        for(char ch: list){
            for(int i=0; i<map.get(ch); i++){//run loop till the frequency of the particular character
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}