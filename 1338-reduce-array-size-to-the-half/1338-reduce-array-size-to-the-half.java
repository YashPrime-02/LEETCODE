class Solution {
    public int minSetSize(int[] arr) {
        int len = arr.length;
        //Element,Frequency
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> frequency = new ArrayList<>(map.values());
        Collections.sort(frequency,Collections.reverseOrder());
        
        int count = 0;
        int totalElement = len;
        int i = 0;
        
        while(totalElement > len/2){
            totalElement = totalElement - frequency.get(i);
            i++;
            count++;
        }
        
        return count;
    }
}