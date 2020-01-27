import java.util.Stack;
public class Solution 
{	
	public static int countBracketReversals(String input)
    {	
        Stack<Character> open = new Stack<Character>();
     
        if(input.length()%2==0)
        {
           
            for(int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == '}' && !open.isEmpty())
                {
                    if(open.peek() == '{')
                        open.pop();
                    else
                        open.push(input.charAt(i));
                }
                else
                    open.push(input.charAt(i));
            }
            int l_open = open.size();
            int count = 0;
            while(!open.isEmpty() && open.peek() == '{')
            {
                open.pop();
                count++;
            }
            return (l_open/2 + count%2);
            
        }
        return -1;

	}
	
	

}
