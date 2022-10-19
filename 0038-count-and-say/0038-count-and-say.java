class Solution {
    public String countAndSay(int n) {
        String start = "1";
        for(int i=1;i<n;i++){
            ArrayList<ArrayList<Integer>> alist = countN(start);
            String temp = generateN(alist);
            start = temp;
        }
        return start;
    }

    private String generateN(ArrayList<ArrayList<Integer>> alist){
        
        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<alist.size();i++){
            sb.append(alist.get(i).get(0));
            sb.append(alist.get(i).get(1));           

        }
        return sb.toString();
    }

    private ArrayList<ArrayList<Integer>> countN(String start){
        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
        int i=0;
        while(i<start.length()){
            int j=i;
            int count =0;
            while(j<start.length() && start.charAt(i)==start.charAt(j)){
                count++;
                j++;
            }
            alist.add(new ArrayList<>(
                Arrays.asList(count, start.charAt(i)-'0')));
            i=j;
        }
        return alist;
    }
}