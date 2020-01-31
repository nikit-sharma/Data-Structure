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
    static int sum=0;
	public static void  print(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        print( root.right);
        
       
        int temp=root.data;
        root.data=root.data+sum;
        sum+=temp;
        
        print(root.left);
        
    }
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		
        
      print(root);   
 
        
	}
}
