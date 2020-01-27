import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) { 
        
        
        while(!s1.isEmpty())
        {
            int x=s1.pop();
            s2.push(x);
        }
        
         while(!s2.isEmpty())
         {
             System.out.print(s2.pop()+" ");
         }
        
        
        
	}
}
        
