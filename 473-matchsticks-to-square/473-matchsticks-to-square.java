class Solution {
  public boolean makesquare(int[] matchsticks) { 
		if(matchsticks.length < 4) return false;

		ArrayList<Integer> list = new ArrayList();
		int total = 0;        
		for(int m:matchsticks){
			list.add(m);
			total += m;
		}
        if(total%4!=0)return false;
		int sideLen = total/4;

		Collections.sort(list, Collections.reverseOrder());
		return canGroup(new int[]{0,0,0,0}, list, 0, sideLen);
	}

	public boolean canGroup(int[] groups, ArrayList<Integer> matchsticks, int index, int sideLen){
		if(index == matchsticks.size()) return groups[0] == groups[1] && groups[1] == groups[2] && groups[2] == groups[3];
		for(int i=0;i<4;i++){
			if(groups[i]+matchsticks.get(index) <= sideLen){
				groups[i] += matchsticks.get(index);
				if(canGroup(groups, matchsticks, index+1, sideLen)) return true;
				groups[i] -= matchsticks.get(index);
			}
		}
		return false;
	} 

}
