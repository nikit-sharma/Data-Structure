

public class Solution {
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		
        
        LinkedListNode<Integer>temp=head;
        int count=0;
        int ans=0;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                ans=count;
                break;

            }
            else
          
                ans=-1;
            count++;
            temp=temp.next;
        }
        return ans;
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}