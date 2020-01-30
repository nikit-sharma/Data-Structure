import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
	
        java.util.PriorityQueue<Integer> pq=new java.util.PriorityQueue<>();
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=0;i<input.length;i++)
        {
            pq.add(input[i]);
        }
        
        while(pq.size()!=k)
        {
            pq.remove();
        }
        
        while(pq.size()!=0)
        {
            al.add(pq.remove());
        }
      
		return al;
	}
}