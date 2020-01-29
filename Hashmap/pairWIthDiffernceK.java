import java.util.*;
public class Solution {

	public static void findPairsDifferenceK(int[] input, int k){
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
      //  int value=0;
        for(int i=0;i<input.length;i++)
        {
            
            if(hm.containsKey(input[i]))
            {
                int value=hm.get(input[i]);
                hm.put(input[i],value+1);
              
            }
            else
            hm.put(input[i],1);
        }
       
        
        
        
        for(int i =0;i<input.length;i++)
        {
            if(hm.containsKey(input[i]+k))
            {
                hm.replace(input[i],hm.get(input[i])-1);
                int value=hm.get(input[i]);
                 
                   while(value>0)
                {
                   System.out.println(input[i] +" "+(input[i]+k));
                   value--;
               } 
              
            }
               
            if(hm.containsKey(input[i]-k)) 
            {
                hm.replace(input[i],hm.get(input[i])-1);
                int value=hm.get(input[i]);
                 //hm.replace(input[i],value-1);
                while(value>0)
                {
                    System.out.println(input[i]-k +" "+input[i]);    
                value--;
                }
         
            }
           
        }		
	}
}
