class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score= 0, low=0, high=tokens.length-1, maxScore=0;
        while(low<=high) {
            if(power>=tokens[low]) {
                power-=tokens[low++];
                score++;
            } else if(score>0) {
                score--;
                power+=tokens[high--];
            } else {
                return maxScore;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}