class Solution {
public int maximumUnits(int[][] boxTypes, int truckSize) {
	Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
	int maxUnits = 0;
	for (int i=0; i<boxTypes.length && truckSize > 0; i++) {
		maxUnits += boxTypes[i][1] * Math.min(truckSize, boxTypes[i][0]);
		truckSize -= boxTypes[i][0];
	}
	return maxUnits;
}}