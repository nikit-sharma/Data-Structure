public class Solution {

	public static boolean checkBalanced(String exp) {
		// Write your code here

        
       java.util.Stack<Character> st=new java.util.Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char x=exp.charAt(i);
            if( x=='{' || x=='[' || x=='(' )
            {
              st.push(x);   
            }
            
            else if(x=='}' || x==']' || x==')' )
            {
                if(st.isEmpty())
                    return false;
                
                if(x=='}' && st.peek()=='{')
                    st.pop();
                 
                if(x==']' && st.peek()=='[')
                    st.pop();
                 
                if(x==')' && st.peek()=='(')
                    st.pop();
                
                
                
            }
            
            
        }
        if(st.isEmpty()==true)
            return true;
        else
            return false;
        
	}
}