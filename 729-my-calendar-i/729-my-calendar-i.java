class MyCalendar {

    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<Integer, Integer>();
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> entry = map.floorEntry(start);
        if(entry!=null && entry.getValue() > start) return false;
         
        entry = map.higherEntry(start);
        if(entry!=null && entry.getKey() < end) return false;
         
        
        map.put(start, end);
        return true;
    }
}