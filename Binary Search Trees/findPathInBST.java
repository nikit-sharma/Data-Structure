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

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
	
        if(root==null)
        {
            return null;
        }
        
      
        
        if(root.data==data)
        {
              ArrayList<Integer> al=new ArrayList<>();
            al.add(root.data);  
            return al;
        }
        
        
        
        ArrayList<Integer> leftt=findPath(root.left,data);
        
        if(leftt!=null)
        {
            leftt.add(root.data);
            return leftt;
        }
        
        
        
        ArrayList<Integer> rightt=findPath(root.right,data);
        
        if(rightt!=null)
        {
            rightt.add(root.data);
            return rightt;
        }
 
        else 
            return null;
        

	}
}