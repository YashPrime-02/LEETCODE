class Solution {
   
    public int[] sortByBits(int[] arr) {
        int[] result = new int[arr.length];
        int[] bits = new int[arr.length];
        
        Arrays.sort(arr);
        
        // logic for finding the bitcounts
        for(int i=0; i<arr.length; i++){
            int count = 0;
            int n = arr[i];
            while(n>0){
                if((n&1) == 1){  
                    count++;
                }
                n >>=1; 
            }
            bits[i] = count;
        }
        
        // we are taking it as 14 because the 0 <= arr[i] <= 10^4
        int index = 0;
        for(int i=0; i<=14; i++){
            for(int j=0; j<bits.length; j++){
                if(i == bits[j]){
                    result[index++] = arr[j];
                }
            }
        }
        
        return result;
    }
}