import java.util.Stack;

public class solution {
	
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
 
        int count=0;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            
            if(c!=')')
            {
                s.push(c);
            }
            else
            {
                while(s.peek()!='(')
                {
                    count++;
                    s.pop();
                }
                s.pop();
                
                if(count==0)
                    return true;
            }
            count=0;
        }
        return false;
        
	}
}