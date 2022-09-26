class Solution {
public List rightSideView(TreeNode root) {
ArrayList<Integer> list=new ArrayList<>();
rightSideViewHelper(root,list,0);
return list;
}
void rightSideViewHelper(TreeNode root,List list,int level){
if(root==null)
return;
if(list.size()==level)
list.add(root.val);
rightSideViewHelper(root.right,list,level+1);
rightSideViewHelper(root.left,list,level+1);
}
}