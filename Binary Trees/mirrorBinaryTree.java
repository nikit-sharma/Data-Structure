
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
	
	public static void mirror(BinaryTreeNode<Integer> root){
		

        if(root==null)
        {
            return ;
        }
        
        BinaryTreeNode<Integer> temp=root.left;
        BinaryTreeNode<Integer> temp1=root.right;
        
        root.left=temp1;
        root.right=temp;
        
        mirror(root.left);
        mirror(root.right);
        
	}
	
}