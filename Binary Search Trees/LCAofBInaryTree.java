public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here

        
        if(root==null)
        {
            return -1;
        }
        
        if(root.data==a || root.data==b)
        {
            return root.data;
        }
        
        int left=lcaBinaryTree( root.left,a, b);
        int right=lcaBinaryTree(root.right,a,b);
        
        if(right==-1 && left==-1)
        {
            return -1;
        }
        
        if(right==-1)
            return left;
        
        if(left==-1)
        return right;
        
        else
            return root.data;
        
	}
}