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

	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here

         QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>> (); 
        queue.enqueue(root); 
        while (!queue.isEmpty())  
        { 
             int levelsize=queue.size();
            
            for( int i=1;i<=levelsize;i++)
            {
               try
               {
                  BinaryTreeNode tempNode = queue.dequeue(); 
                  System.out.print(tempNode.data + " "); 
          
                
               //Enqueue left child 
                   if (tempNode.left != null) { 
                   queue.enqueue(tempNode.left); 
                   } 
  
            //Enqueue right child 
                  if (tempNode.right != null) { 
                  queue.enqueue(tempNode.right); 
                  } 
              
               }
                catch(QueueEmptyException e)
                {
                
                }
    
            }
            System.out.println();
                        
   
	} 


}
}