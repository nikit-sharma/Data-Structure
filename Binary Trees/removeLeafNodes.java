import java.util.ArrayList;


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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		
        
        if(root==null)
        {
           
            return null;
        }
        
        if(root.right==null && root.left==null)
            return null;
        
        root.left=removeAllLeaves( root.left);
        root.right=removeAllLeaves( root.right);
        

        return root;
	}



}
