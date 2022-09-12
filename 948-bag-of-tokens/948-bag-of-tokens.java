class Solution {
    public int bagOfTokensScore(int[] a, int power) {
        Arrays.sort(a);
        int score= 0, l=0, h=a.length-1, maxScore=0;
        while(l<=h) {
            if(power>=a[l]) {
                power-=a[l++];
                score++;
            } else if(score>0) {
                score--;
                power+=a[h--];
            } else {
                return maxScore;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}