class Solution {
    
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Integer j=mp.get(nums[i]);
            mp.put(nums[i],(j==null)?1:j+1);
        }
        for(int i=0;i<n;i++){
            int temp=0;
            int num=nums[i];
            if(mp.get(num)==0){
                continue;
            }
            int freq=mp.get(num);
            while(mp.get(num)!=null && mp.get(num)>=freq){
                freq=Math.max(mp.get(num),freq);
                mp.put(num,mp.get(num)-1); 
                temp+=1;
                num+=1;
            }
            if(temp<3){
                 return false;
            }
        }
         
        return true;
    }
}