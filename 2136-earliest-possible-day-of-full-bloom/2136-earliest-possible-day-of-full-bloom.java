class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        int n = plantTime.length;
        Plant[] plants = new Plant[n];
        
        for(int i=0; i<n; i++) {
            plants[i] = new Plant(plantTime[i], growTime[i]);
        }
        
        Arrays.sort(plants,(A,B)->(B.growTime - A.growTime));
        
        int prevDays = 0;
        int result = 0;
        
        for(int i=0; i<n; i++) {
            result = Math.max(result, (plants[i].plantTime + plants[i].growTime + prevDays));
            prevDays += plants[i].plantTime;
        }
        
        return result;
    }
}


class Plant{
    int plantTime;
    int growTime;
    
    Plant(int p, int g){
        plantTime = p;
        growTime = g;
    }
}