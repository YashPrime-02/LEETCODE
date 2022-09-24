
class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    int tg=0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        tg=targetSum;//Global variable to reduce memory
        help(root,new ArrayList<>(),0,0);//recursive call
        return ans;
        
        
    }
    
    void help(TreeNode root,List<Integer>l,int sum,int i)
    {
        if(root==null )
            return ;
        sum+=root.val;//to maintain sum of the path
        l.add(root.val);
        help(root.left,l,sum,i+1);
        help(root.right,l,sum,i+1);
        if(root.left==null&&root.right==null)//Find ans
        {
            if(tg==sum)
                ans.add(new ArrayList(l));
        
        }
        l.remove(i);//Remove the cuurent node value
        return;
    }
}