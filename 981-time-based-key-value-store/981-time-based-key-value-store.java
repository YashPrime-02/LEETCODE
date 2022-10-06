class Node {
    String value;
    int timestamp;

    Node(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}

class TimeMap {    
    Map<String, PriorityQueue<Node>> map;
    
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        PriorityQueue<Node> pq;
        
        if (map.containsKey(key)) {
            map.get(key).add(new Node(value, timestamp));
        } else {
            pq = new PriorityQueue<>((a, b) -> b.timestamp - a.timestamp);
            pq.add(new Node(value, timestamp));
            map.put(key, pq);
        }
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        
        PriorityQueue<Node> pq = map.get(key);
        
        for (Node item: pq) {
            if (item.timestamp == timestamp) {
                return item.value;
            } else if (item.timestamp <= timestamp) {
                return item.value;
            }
        };
        
        return "";
    }
}