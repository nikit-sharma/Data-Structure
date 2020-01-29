import java.util.*;
public class solution {

	public static String uniqueChar(String str){
		// Write your code here

        HashMap<String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
             String x=str.charAt(i)+"";
          
       
            
            if(hm.containsKey(x))
            {
                int x1=hm.get(x); 
               
                hm.put(x,x1+1);
            }
            else
            {
              hm.put(x,1);
              
            }
            
        }
        
        
        String s1="";
        for(int i=0; i<str.length(); i++){
            String ans=""+str.charAt(i);
            if(hm.containsKey(ans)){
                s1+=ans;
                hm.remove(ans);
            }
        }
        return s1;
	}
}
