class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String p : paths) {
            String[] arr = p.split(" ");
            String root = arr[0];
            for (int i = 1; i < arr.length; i++) {
                String file = arr[i];
                int openParenIdx = file.lastIndexOf('(');
                String content = file.substring(openParenIdx + 1, file.length() - 1);
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(root + "/" + file.substring(0, openParenIdx));
            }
        }
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                res.add(entry.getValue());
            }
        }
        return res;
    }
}