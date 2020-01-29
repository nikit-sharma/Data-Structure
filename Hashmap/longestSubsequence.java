import java.util.*;
public class Solution 
{
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) 
    {
        
   
        
       // 1. Create hashmap and put arr elements in it
        HashMap<Integer, Boolean> map= new HashMap<>();
        for(int i=0;  i<arr.length; i++)
        {
            if(map.containsKey(arr[i])==true)
            {
                map.put(arr[i], true); 
            }
            map.put(arr[i], false);
        }
        
        //2. Identify leader elements
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]-1))
            {
                map.put(arr[i], true);  //normal
            }
            else
            {
                //leader element so already false
            }
        }
        //3.  Final step
        int streak_len=0;
        int leader=-1;
        for(int i=0;  i<arr.length; i++)
        {
            if(map.get(arr[i])==false)
            {
                int mylen=0;
                int temp=arr[i];
                while(map.containsKey(temp))
                {
                    mylen++;
                    temp++;
                }
                if(mylen>streak_len)
                {
                    streak_len=mylen;
                    leader=arr[i];
                }
                else
                {
                    //nothing
                }
            }
        }
        //4. Create ArrayList
        ArrayList<Integer> mylist= new ArrayList<>();
        for(int lv=leader; lv<(streak_len+leader); lv++)
        {
            mylist.add(lv);
        }
        return mylist;
	}
}