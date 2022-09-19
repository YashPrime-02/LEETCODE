class Solution {
    public int[] findOriginalArray(int[] multi) {
    int[] temp = new int[multi.length/2];
    Queue<Integer> x = new LinkedList<>();
    Arrays.sort(multi);
    int i = 0;
    for(int num : multi){
        if(!x.isEmpty() && x.peek()==num)
            temp[i++] = x.poll()/2;
        else x.add(num*2);
    }
    return x.size()>0 ? new int[]{}:temp;
}
    }