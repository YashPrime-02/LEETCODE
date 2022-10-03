class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = neededTime.length;
        char[] colorsArr = colors.toCharArray();
        int cost = 0;
        for (int i = 0; i < n - 1; i++) {
            if (colorsArr[i] == colorsArr[i + 1]) {

                if (neededTime[i] < neededTime[i + 1]) {
                    cost += neededTime[i];
                } else {
                    cost += neededTime[i + 1];
                    neededTime[i + 1] = neededTime[i];
                }
            }
        }
        return cost;
    }
}