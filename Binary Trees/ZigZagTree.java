import java.util.*;;


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

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		
        if(root==null)
        {
            return;
        }
        
       
         Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> s2=new Stack<BinaryTreeNode<Integer>>();
        
       
        
        boolean flag=true;
        
        s1.push(root); 
        
        while(!s1.isEmpty())
        {
          BinaryTreeNode<Integer>  save=s1.pop();
            System.out.print(save.data+" ");
            if(flag)
            {
                
                if(save.left!=null){
                    s2.push(save.left); 
                }
                if(save.right!=null){
                    s2.push(save.right);
                }     
            }
            else
            {
                if(save.right!=null){
                    s2.push(save.right);
                }  
                 if(save.left!=null){
                    s2.push(save.left);
                }
                
            }
            
             if (s1.isEmpty()) 
             { 
        flag = !flag; 
        Stack<BinaryTreeNode<Integer>> temp = s1; 
        s1 = s2; 
        s2 = temp;
              System.out.println();    
        }
        }
        
        
        

	


	}


}
