class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
		int k=0;
		HashMap<String,Integer> map=new HashMap<>();

		for(int i=0;i<strs.length;i++) {
			String str=strs[i];
			char []ch=str.toCharArray();
			Arrays.sort(ch);
			String key=String.valueOf(ch);
			if(map.containsKey(key)) {
				List<String> l1=l.get(map.get(key));
				l1.add(str);
				l.set(map.get(key),l1);
			}else {
				map.put(key,k);
				List<String> l1=new ArrayList<>();
				l1.add(str);
				l.add(l1);
				k++;
			}
		}
		return l;
    }
}