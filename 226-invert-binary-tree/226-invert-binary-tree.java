class Solution {
	public TreeNode invertTree(TreeNode root) {
		//check for null root
		if (root==null){return root;}

		//return root if there are no children
		if(root.left==null && root.right==null){return root;}

		//declare treenodes that will become the right and left children of root
		TreeNode right=null;
		TreeNode left=null;

		//recursively call invert tree - assign the left child to treeNode right, and right child to treeNode left
		if(root.left!=null ) {right=invertTree(root.left);}
		if(root.right!=null ) {left=invertTree(root.right);}

		//set the right/left pointers of root
		root.right=right;
		root.left=left;

		//return root
		return root;

	}
}
