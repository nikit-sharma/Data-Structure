public class Solution {
    
    
    
    
    public static boolean  check(BinaryTreeNode<Integer> root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        
        if(root.data<min || root.data>max)
        {
            return false;
        }
        
        boolean left=check(root.left,min, root.data-1);
        boolean right=check(root.right,root.data,max);
        return(left&&right);
        
    }

	public static boolean isBST(BinaryTreeNode<Integer> root) {
	
        return (check(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        
        
        
        
	}
}