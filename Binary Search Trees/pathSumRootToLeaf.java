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
    
    public static void print(BinaryTreeNode<Integer> root, int sum, String s)
    {
        
        if(root==null)
        {
            return ;
        }
       
        if(root.left==null && root.right== null)
            
        {
            if(root.data==sum)
           {
              s+=root.data+" ";
                   System.out.println(s+" ");
                
           }
        }
        print( root.left, sum-root.data, s+root.data+" ");
        
        print( root.right, sum-root.data, s+root.data+" ");
        
   
        
    }
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

		
	}
}
