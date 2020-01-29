import java.util.*;
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
	    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        int max = 0 ;
        int pos=0;
            for(int i=0;i<arr.length;i++)
            {
                if(hm.containsKey(arr[i]))
                {
                    int n = hm.get(arr[i]);
                    hm.put(arr[i],n+1);
                }
                else
                    hm.put(arr[i],1);
                
                if(hm.get(arr[i])>max)
                {
                    max=hm.get(arr[i]);
                    pos=arr[i];
                }
            }
		
        return pos;
	}
}