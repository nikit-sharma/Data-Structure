import java.util.*;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		

        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            if(hm.containsKey(arr1[i]))
            {
                int n=hm.get(arr1[i]);
                hm.put(arr1[i],n+1);
            }
            else
             hm.put(arr1[i],1);
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(hm.containsKey(arr2[i]))
            {
                
                System.out.println(arr2[i]);
                int n=hm.get(arr2[i]);
                if(n>1)
                hm.put(arr2[i],n-1);
               else
                hm.remove(arr2[i]);  
            }
            
           
            
        }
        
    }
}