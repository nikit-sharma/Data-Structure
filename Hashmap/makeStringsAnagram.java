import java.util.*;
public class Solution{
    
	public static int makeAnagram(String s1,String s2){
       
        
        
       HashMap<Character,Integer> hm= new HashMap<>();
        
        for(int i=0;i<s2.length();i++)
        {
            if(hm.containsKey(s2.charAt(i)))
            {
                int x=hm.get(s2.charAt(i));
                hm.put(s2.charAt(i),x+1);
            }
             else
                hm.put(s2.charAt(i),1);
        }
        
      int count=0;
        int count1=0;
       
        ArrayList<Character> al=new ArrayList<>(hm.keySet());
        for(int i=0;i<s1.length();i++)
        {
            if(!hm.containsKey(s1.charAt(i)))
            {
                count++;
                 

            }
            else if(hm.get(s1.charAt(i))==0)
                count++;
            else
            {
              
                int x=hm.get(s1.charAt(i));
                hm.put(s1.charAt(i),x-1);
              
            }
                
        }
       
        
         for(int i=0;i<s2.length();i++)
        {
            if(hm.containsKey(s2.charAt(i)) && hm.get(s2.charAt(i))>=1)
            {
                count1++;
                int x=hm.get(s2.charAt(i));
                 hm.put(s2.charAt(i),x-1);
            }
                 
        }
        
        
        
        return count+count1;
	}

}
