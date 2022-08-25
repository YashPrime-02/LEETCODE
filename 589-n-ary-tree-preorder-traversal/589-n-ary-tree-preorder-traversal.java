class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> values = new ArrayList<>();
        
        return root == null ? values : scan(root, values);
    }
    
    private List<Integer> scan (Node node, List<Integer> values){
        
        values.add(node.val);
        
        if (node.children.isEmpty())
            return values;
        
       node.children.forEach((child) -> scan(child, values));
        return values;
            
    }
}