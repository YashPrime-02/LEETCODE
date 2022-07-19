class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> l = new ArrayList<>();
         l.add(1);
         res.add(new ArrayList<>(l));
         for(int i=1;i<numRows;i++){
             List<Integer> list = new ArrayList<>();
             list.add(1);
             for(int j=1;j<=i;j++){
                 if(j==i){
                     list.add(1);
                     break;
                 }
                 int sum = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                 list.add(sum);
             }
             res.add(new ArrayList<>(list));
         }
        return res;
    }
}