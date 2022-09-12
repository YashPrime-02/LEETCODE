class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length,i=0,j=n-1,score=0,maxScore=0;
        while(i<=j){
            if(power>=tokens[i]){
                score++;
                power-=tokens[i];
                i++;
            }else{
                if(score==0) return maxScore;
                score--;
                power+=tokens[j];
                j--;
            }
            maxScore=Math.max(maxScore,score);
        }
        return maxScore;
    }
}